package SortingSearching;

public class Kelas2B_Shellsort {
    public static void shellSort(int[]arr){
        int n=arr.length;
        int C,M;
        int jarak,i,j,kondisi;
        boolean Sudah=true;
        int temp;
        C=0;
        M=0;
        jarak=n;
        while (jarak>=1){
            jarak=jarak/2;
            Sudah = true;
            while(Sudah){
                Sudah=false;
                for(j=0;j<n-jarak;j++){
                    i=j+jarak;
                    C++;
                    if(arr[j]>arr[i]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
    }
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int A[]={3,10,4,2,8,13};
        Kelas2B_Shellsort.tampil(A);
        Kelas2B_Shellsort.shellSort(A);

        int cari = 8;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int ketemu = 0;
        int point = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.println("");

        while ((IndeksAwal <= IndeksAkhir)&&(ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+point);
            if(cari == A[point]){
                ketemu = 1;
                System.out.println("Data " +
                        cari + " Telah ditemukan pada index ke "+point);
            }

            else if(cari < A[point]){
                System.out.println("Cari di kiri ");
                IndeksAkhir = point -1;
            }

            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan data ditemukan ");
        else
            System.out.println("Kesimpulan data tidak ditemukan ");
    }
}

