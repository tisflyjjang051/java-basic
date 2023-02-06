public class Array02 {

  public static void main(String[] args) {
    int intArray[][] = new int[2][3];
    intArray[0][0] = 1;
    intArray[0][1] = 2;
    intArray[0][2] = 3;
    intArray[1][0] = 10;
    intArray[1][1] = 20;
    intArray[1][2] = 30;

    int intArray02[][] = { { 1, 2, 3 }, { 10, 20, 30 } };
    System.out.println(intArray02[1][2]);

    double score[][] = new double[4][2];
    score[0][0] = 2.75;
    score[0][1] = 3.5;
    score[1][0] = 3.8;
    score[1][1] = 3.86;
    score[2][0] = 3.16;
    score[2][1] = 4.17;
    score[3][0] = 4.27;
    score[3][1] = 4.37;
    double score02[][] = {
      { 2.75, 3.5 },
      { 3.8, 3.86 },
      { 3.16, 4.17 },
      { 4.27, 4.37 },
    };
    double sum = 0;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        sum += score[i][j];
      }
    }
    double avg = sum / 8;
    System.out.println(avg);
    double score03[][] = new double[4][];
    score03[0] = new double[2];
    score03[1] = new double[3];
    score03[2] = new double[2];
    score03[3] = new double[3];
    score03[0][0] = 4.3;
    score03[0][1] = 3.3;
    score03[1][0] = 4.3;
    score03[1][1] = 3.6;
    score03[1][2] = 4.13;
    score03[2][0] = 4.23;
    score03[2][1] = 4.19;
    score03[3][0] = 4.21;
    score03[3][1] = 4.32;
    score03[3][2] = 4.5;
  }
  //try catch finally  예외처리...
}
