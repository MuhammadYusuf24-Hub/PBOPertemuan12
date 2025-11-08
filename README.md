# PBOPertemuan12
Dalam pengembangan aplikasi berbasis database, sering kali dibutuhkan sistem yang mampu menampilkan dan mengelola data dari beberapa tabel yang saling berelasi. Relasi antar tabel (foreign key) memungkinkan data terhubung secara logis, misalnya antara tabel menu dan tabel pesanan dalam sistem pemesanan makanan.  
Java menyediakan berbagai cara untuk berinteraksi dengan database, salah satunya menggunakan Java Persistence API (JPA) yang mempermudah pengelolaan data melalui konsep entity tanpa perlu menulis banyak kode SQL secara manual. Dengan JPA, operasi seperti Create, Read, Update, Delete (CRUD) dapat dilakukan secara lebih efisien dan terstruktur.  
Selain itu, untuk menampilkan hasil data dalam bentuk laporan profesional, digunakan JasperReports, yang mampu menghasilkan laporan dalam berbagai format. Integrasi antara JTable, JPA, dan JasperReports menghasilkan aplikasi yang tidak hanya dapat menampilkan dan memproses data secara dinamis, tetapi juga menghasilkan laporan yang rapi dan terurut.  
Oleh karena itu, praktikum ini dilakukan untuk mempelajari bagaimana membangun aplikasi CRUD berbasis Java yang terhubung dengan dua tabel berelasi melalui foreign key, menggunakan JPA (Persistence) untuk koneksi database, dan JasperReports untuk pembuatan laporan.  

1.	Java Persistence API (JPA)  
JPA adalah spesifikasi Java yang digunakan untuk mengelola data relasional dalam aplikasi Java. Dengan JPA, data disimpan dalam bentuk objek (Entity Class) yang kemudian dipetakan ke tabel dalam database. JPA mempermudah pengembang dalam melakukan operasi CRUD tanpa harus menulis query SQL secara manual.

3.	Foreign Key  
Foreign key adalah kolom dalam tabel yang menunjuk ke primary key di tabel lain. Fungsinya untuk menjaga integritas data dan menunjukkan hubungan antar entitas
 
4.	JTable  
JTable merupakan komponen GUI dalam Java Swing yang digunakan untuk menampilkan data dalam bentuk tabel. JTable sering digunakan bersama dengan TableModel agar data dapat diperbarui secara dinamis sesuai isi database. JTable biasanya digunakan untuk menampilkan hasil query atau isi dari entity yang telah diambil melalui JPA.  

5.	CRUD (Create, Read, Update, Delete)  
CRUD adalah empat operasi dasar dalam pengelolaan data:  
a.	Create: menambah data baru ke database.  
b.	Read: menampilkan data yang sudah ada.  
c.	Update: memperbarui data tertentu.  
d.	Delete: menghapus data dari database.  
Keempat operasi ini diimplementasikan menggunakan EntityManager dari JPA.

6.	JasperReports  
JasperReports adalah library open-source untuk menghasilkan laporan dari data aplikasi. Laporan dapat dihasilkan dalam berbagai format seperti PDF, HTML, atau Excel. Dalam proyek ini, JasperReports digunakan untuk mencetak data dari tabel yang berelasi (foreign key), dengan hasil laporan yang sudah diurutkan berdasarkan kolom tertentu menggunakan perintah SQL ORDER BY.  


# Langkah – Langkah :
1.	Buat database baru yang memiliki 2 tabel yang saling terhubung foreign key
2.	Kemudian buat project baru pada neatbeans, buat package baru dan class jframe form
3.	Design jframe form, tambahkan panel terlebih dahulu, kemudian tambahkan tabbed pane. Tambahkan 2 panel ke dalam tabbed pane, setelah itu pada masing masing panel masukkan table dan 5 button seperti pada gambar
 
4.	Buat 6 dialog yang digunakan untuk insert update dan delete
 
Kemudian design ke 6 dialog seperti contoh berikut:
Insert
 
Update
 
Delete
 
Lakukan juga untuk ketiga dialog lainnya, sesuaikan dengan table pada database kalian 

5.	Kemudian buat class persistence di bagian berikut
 
6.	Tambahkan juga class untuk jasper yang digunakan untuk mencetak laporan di bagian berikut.
buat 2 yang digunakan untuk table 1 dan 2
 
7.	Kemudian design bentuk laporan jasper untuk masing masing tabel 
8.	Ketik program berikut untuk masing masing button pada design jframe awal
Insert tab 1:
 
Update tab 1:
 
Delete tab 1:
 

Cetak tab 1:
 











Upload tab 1:
 
 

Insert tab 2:
 






Update tab 2:
 
Delete tab 2:
 

Cetak tab 2:
 
Upload tab 2:
 
 
 

9.	Kemudian ketik juga program di bagian button dari ke 6 dialog
InsertDialog:
  
 









UpdateDialog :
 

DeleteDialog:
Button Ya
 
 

Button Tidak 
 
InsertDialog1:
 
 
UpdateDialog1:
 
 
DeleteDialog1:
Button Ya
 

Button Tidak 
 
10.	Buat 2 method untuk menampilkan data ke masing masing table
Method tab 1:
 
Method tab2:
 
 

11.	Setelah semua selesai maka program bisa dijalankan 
Tab 1:
 
Tab 2:
 

