package Jobsheet6;

public class DaftarMahasiswaBerprestasi17 {
    Mahasiswa17 listMhs17[] = new Mahasiswa17[5];
    int idx;

    void tambah(Mahasiswa17 m){
        if(idx<listMhs17.length){
            listMhs17[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa17 m : listMhs17){
            m.tampil();
            System.out.println("----------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs17.length-1; i++){
            for(int j=1; j<listMhs17.length-i; j++){
                if(listMhs17[j].ipk > listMhs17[j-1].ipk){
                    Mahasiswa17 tmp = listMhs17[j];
                    listMhs17[j] = listMhs17[j-1];
                    listMhs17[j-1] = tmp;
                }
            }
        }  
    }

    
    void selectionSort() {
        for (int i=0; i<listMhs17.length; i++) {
            int idxMin = i;
            for (int j=i+1; j<listMhs17.length; j++) {
                if(listMhs17[j].ipk < listMhs17[idxMin].ipk){
                    idxMin = j;
                }
            }   

            Mahasiswa17 tmp = listMhs17[idxMin];
            listMhs17[idxMin] = listMhs17[i];
            listMhs17[i] = tmp;
        }   
    }

    void insertionSort() {
        for (int i = 1; i < listMhs17.length; i++) {
            Mahasiswa17 temp = listMhs17[i];
            int j = i;
            while (j > 0 && listMhs17[j - 1].ipk < temp.ipk){
                listMhs17[j] = listMhs17[j - 1];
                j--;
            }
            listMhs17[j] = temp;  
        }
    }
}
