public class Tugas1Array2{
    public static void main(String[] args) {
        char[][] nama = new char [8][5];
        char[] karakter = {'I','l','h','a','m','G','e','g','a','n','a','R','a','y','a','F','i','r','m','a','n','s','y','a','h'};

         for (int i = 0; i < nama.length; i++){
            for (int j = 0; j < nama[0].length; j++){
                if ((i*nama[0].length+j) % karakter.length == (i*nama[0].length+j) % karakter.length){
                    nama[i][j] = karakter[(i*nama[0].length+j) % karakter.length];
                    }
                }
            }
        for (int i = 0; i < nama.length; i++){
            for (int j = 0; j < nama[0].length; j++){
                System.out.print(nama[i][j] + " ");
            }
            System.out.println("");
        }
    }
}