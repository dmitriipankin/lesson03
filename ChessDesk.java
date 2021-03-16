package lesson03;

/**
 * Проверка корректности введенных координат происходит в соответствующих методах set.
 * Методы set выбрасывают исключение соответсвующего типа.
 * Конструктор класса использует методы set для полей xCoordinate и yCoordinate.
 * Чтобы задать координату создайте экземпляр класса ChessDesk с корректными координатами.
 */
public class ChessDesk {
    private int xCoordinate;
    private int yCoordinate;

    public ChessDesk(int xCoordinate, int yCoordinate){
       this.setxCoordinate(xCoordinate);
       this.setyCoordinate(yCoordinate);
    }

    public int getxCoordinate() {
        return this.xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        if(xCoordinate<1||xCoordinate>8)
            throw new IllegalArgumentException("Некорректное значение. Задайте число от 1 до 8");
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return this.yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        if(yCoordinate<1||yCoordinate>8)
            throw new IllegalArgumentException("Некорректное значение. Задайте число от 1 до 8");
        this.yCoordinate = yCoordinate;
    }

    public String toAlphabet(int i){
        return  String.valueOf((char)(i + 'A' - 1));
    }
    @Override
    public String toString() {
        String letter = null;
        String numeral = null;
        for (int i = 1; i<9; i++){
            if(this.xCoordinate==i)
                 letter = toAlphabet(i);
            for (int j = 1; j < 9; j++) {
                if(this.yCoordinate==j)
                    numeral = Integer.toString(j);
            }
        }
        return letter+numeral;
    }

    public static void main(String[] args) {
        ChessDesk index = new ChessDesk(2,1);
        System.out.println(index.toString());
    }

}
