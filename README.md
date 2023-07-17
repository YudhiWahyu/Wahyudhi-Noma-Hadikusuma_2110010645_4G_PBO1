# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari Container tersebut seperti isi Box, merk, berat, dan warna.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Container`, `ContainerInfo`, dan `ContainerBeraksi` adalah contoh dari class.

```bash
public class Container {
    ...
}

public class ContainerInfo extends Container {
    ...
}

public class ContainerBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ContainerInfo[] containers = new ContainerInfo[1];` adalah contoh pembuatan object.

```bash
ContainerInfo[] containers = new ContainerInfo[1];
```
```bash
containers[i] = new ContainerInfo(isiBox, merk, berat, warna);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini `isiBox`, `merk`, `berat`, dan `warna` adalah contoh atribut.

```bash
String isiBox;
String merk;
String berat;
String warna;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Container` dan `ContainerInfo`.

```bash
public Container(String isiBox, String merk, String berat, String warna) {
        this.isiBox = isiBox;
        this.merk = merk;
        this.berat = berat;
        this.warna = warna;
    }

public ContainerInfo(String isiBox, String merk, String berat, String warna) {
        super(isiBox, merk, berat, warna);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setisiBox`, `setMerk`, `setBerat`, dan `setWarna` adalah contoh method mutator.

```bash
public void setisiBox(String isiBox) {
        this.isiBox = isiBox;
    }

public void setMerk(String merk) {
        this.merk = merk;
    }

public void setBerat(String berat) {
        this.berat = berat;
    }
    
public void setWarna(String warna) {
        this.warna = warna;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getisiBox`, `getMerk`, `getBerat`, `getWarna`, `getKodeIsiBox`, `getKodemerk`, dan `getKodeBerat` adalah contoh method accessor.

```bash
public String getisiBox() {
        return isiBox;
    }

public String getMerk() {
        return merk;
    }

public String getBerat() {
        return berat;
    }
    
public String getWarna() {
        return warna;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `isiBox`, `merk`, `berat`, dan `warna` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String isiBox;
protected String merk;
protected String berat;
protected String warna;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ContainerInfo` mewarisi `Container` dengan sintaks `extends`.

```bash
public class ContainerInfo extends Container {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `String tampilanInfo ()` di `Container` merupakan overloading method `String tampilanInfo ()` dan `public String getWarna()` di `ContainerInfo` merupakan override dari method `public String getWarna() ` di `Container`.

```bash
@Override
public String tampilanInfo (){
        return "Isi Box          : "+getisiBox()+
                "\nMerk Container   : "+getMerk()+
                "\nBerat Container  : "+getBerat()+
                "\nBerat Container  : "+getWarna()+
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
}

@Override
public String getWarna() {
        return super.warna.substring(0, 3);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else if` dalam method `getKodeBerat` dan seleksi `switch` dalam method `getKodemerk`.

```bash
    public String getKodemerk(){
        String Kodemerk = getMerk().substring(0, 2);
        
        switch (Kodemerk) {
            case "HY" :
                return "HYU";
            case "DO" :
                return "DON";
            case "HA" :
                return "HAM";
            default :
                System.out.println("Tidak ada kode merk Kontainer");
        }
        return null;
    }
    
    public String getKodeBerat (){
        String kodeBerat = getBerat().substring(0, 2);
        
        if (kodeBerat.equals("20")) {
               return "20.000 KG";
        } else {
        if (kodeBerat.equals("27")) {
               return "27.000 KG";
        } else {
        } return "30.000 KG";
            
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < containers.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.print` untuk menampilkan output.

```bash
        System.out.println("");
        System.out.println("Masukkan data container ke-" + (i+1));
            System.out.println("HURUF BESAR");

        System.out.print("Apa isi Box Container : ");
            String isiBox = scanner.nextLine();
            
        System.out.println("a. CK = 20.000 KG");
        System.out.println("b. CS = 27.000 KG");
        System.out.println("c. CB = 30.000 KG");
        System.out.print("Kode Berat Box        : ");
            String berat = scanner.nextLine();
            
        System.out.println("a.HY = HYUNDAI");
        System.out.println("b.DO = DONFANG");
        System.out.println("c.HA = HAMBURG");
            System.out.print("Merk Container    : ");
            String merk = scanner.nextLine();
            
        System.out.print("Warna : ");
            String warna = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ContainerInfo[] containers = new ContainerInfo[2];` adalah contoh penggunaan array.

```bash
ContainerInfo[] containers = new ContainerInfo[2];

containers[i] = new ContainerInfo(isiBox, merk, berat, warna);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
     ....
 } finally {
           System.out.println("PENGISIAN FORM BOX CONTAINER SUKSES");
           }
{
...
}
...
    {
System.out.println("#SUKSES#");    
    }   
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama : Wahyudhi Noma Hadikusuma
NPM  : 2110010645
