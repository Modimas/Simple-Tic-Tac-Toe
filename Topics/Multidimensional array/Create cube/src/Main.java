
class ArrayOperations {
    public static final int THREE = 3;

    public static int[][][] createCube() {
        // write your code here
        int[][][] createCube = new int[THREE][THREE][THREE];
        for (int i = 0; i < createCube.length; i++) {
            for (int j = 0; j < createCube[i].length; j++) {
                for (int k = 0; k < createCube[i][j].length; k++) {
                    createCube[i][j][k] = j * THREE + k;
                }
            }
        }
        return createCube;
    }
}