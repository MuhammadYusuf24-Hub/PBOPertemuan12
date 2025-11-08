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
 <img width="730" height="542" alt="image" src="https://github.com/user-attachments/assets/992df3dc-5958-4852-b91d-52aedaf7f029" />  

4.	Buat 6 dialog yang digunakan untuk insert update dan delete  
 <img width="339" height="234" alt="image" src="https://github.com/user-attachments/assets/b240e604-e6b2-449f-aa7f-85b81fc0f57f" />  

Kemudian design ke 6 dialog seperti contoh berikut:  
Insert  
 <img width="511" height="397" alt="image" src="https://github.com/user-attachments/assets/d9e0b85d-6411-4838-9068-e374575a350a" />  

Update  
 <img width="513" height="400" alt="image" src="https://github.com/user-attachments/assets/2693c42c-6aa1-459d-9b69-4eec897d300c" />  

Delete  
 <img width="578" height="469" alt="image" src="https://github.com/user-attachments/assets/271002a5-a126-438e-90a4-4ede35b4b6e5" />  

Lakukan juga untuk ketiga dialog lainnya, sesuaikan dengan table pada database kalian  

5.	Kemudian buat class persistence di bagian berikut  
 <img width="613" height="244" alt="image" src="https://github.com/user-attachments/assets/a03d6146-9cad-4e7f-ada2-83afcaa39a2c" />  

6.	Tambahkan juga class untuk jasper yang digunakan untuk mencetak laporan di bagian berikut.  
buat 2 yang digunakan untuk table 1 dan 2  
 <img width="752" height="255" alt="image" src="https://github.com/user-attachments/assets/e595e24b-cccf-4b62-b87f-7b26396342be" />  

7.	Kemudian design bentuk laporan jasper untuk masing masing tabel  
8.	Ketik program berikut untuk masing masing button pada design jframe awal  
Insert tab 1:  
 <img width="828" height="195" alt="image" src="https://github.com/user-attachments/assets/d1408b64-ae73-4a1c-a392-f225c5d61af0" />  

Update tab 1:  
 <img width="719" height="550" alt="image" src="https://github.com/user-attachments/assets/19d230ee-82ad-4a4a-911a-3b9a86c2c2d5" />  

Delete tab 1:  
 <img width="786" height="749" alt="image" src="https://github.com/user-attachments/assets/84819816-dfb4-4c92-b3d5-ec3aea82f37c" />  

Cetak tab 1:  
 <img width="814" height="279" alt="image" src="https://github.com/user-attachments/assets/4369223a-8112-4eaa-ba1f-2d526e2ec7ff" />  

Upload tab 1:  
 <img width="686" height="533" alt="image" src="https://github.com/user-attachments/assets/548b544d-e895-416e-b677-857bae00b31d" />  
 <img width="789" height="501" alt="image" src="https://github.com/user-attachments/assets/15bb1220-64a3-4243-b408-42e7902fd366" />  

Insert tab 2:  
 <img width="672" height="147" alt="image" src="https://github.com/user-attachments/assets/35b07a4b-08d4-476d-9cae-80ee72b1affc" />  
 
Update tab 2:  
 <img width="805" height="529" alt="image" src="https://github.com/user-attachments/assets/74958570-8ac9-44f3-a867-0d2f75e6e1a5" />  

Delete tab 2:  
 <img width="824" height="534" alt="image" src="https://github.com/user-attachments/assets/c1535e7c-fecf-4350-933e-3aef7a4b0660" />  

Cetak tab 2:  
 <img width="770" height="273" alt="image" src="https://github.com/user-attachments/assets/a6de687d-01ca-4fe3-9d2c-b91e1baabe83" />  

Upload tab 2:  
 <img width="807" height="586" alt="image" src="https://github.com/user-attachments/assets/eea41c79-3d63-4863-a030-f6d20fbdb86b" />  
 <img width="893" height="595" alt="image" src="https://github.com/user-attachments/assets/062c320e-d11c-4b61-838f-9804fd039317" />  
 <img width="940" height="270" alt="image" src="https://github.com/user-attachments/assets/50956dcf-cf7f-46d1-a40f-35942eec383d" />  

9.	Kemudian ketik juga program di bagian button dari ke 6 dialog  
InsertDialog:  
  <img width="920" height="718" alt="image" src="https://github.com/user-attachments/assets/34332b7d-bd53-4270-9648-ebd4aa29f903" />  
<img width="863" height="113" alt="image" src="https://github.com/user-attachments/assets/d0f5f7b5-8f5f-4ad0-91e2-02c0e20ea508" />  

UpdateDialog :  
 <img width="940" height="736" alt="image" src="https://github.com/user-attachments/assets/d6f0615b-6250-4b63-9ef8-5bf01e0ddb1c" />   

DeleteDialog:  
Button Ya  
 <img width="744" height="592" alt="image" src="https://github.com/user-attachments/assets/69c84c60-8a0c-4450-8246-33c6bbc1e146" />  
 <img width="772" height="566" alt="image" src="https://github.com/user-attachments/assets/3d589ab0-01e9-4165-99b9-b9391923893d" />  
 
Button Tidak  
 <img width="777" height="105" alt="image" src="https://github.com/user-attachments/assets/059ea81c-7af4-4498-b6e2-5442e403436b" />  

InsertDialog1:  
 <img width="940" height="616" alt="image" src="https://github.com/user-attachments/assets/47f97b8a-6cfc-4e7c-a662-29d76c30eb18" />  
 <img width="940" height="266" alt="image" src="https://github.com/user-attachments/assets/f06a8380-ea57-4703-acdc-22b869b224a3" />  

UpdateDialog1:  
 <img width="759" height="523" alt="image" src="https://github.com/user-attachments/assets/08bcac62-f535-4991-8478-374706935eff" />  
 <img width="863" height="607" alt="image" src="https://github.com/user-attachments/assets/65fe8098-4997-447b-9d66-d3a630d827f1" />  

DeleteDialog1:  
Button Ya  
 <img width="940" height="650" alt="image" src="https://github.com/user-attachments/assets/66142adc-cbb2-4c98-bf89-ca8d6c716089" />  

Button Tidak  
 <img width="849" height="108" alt="image" src="https://github.com/user-attachments/assets/e412c387-e89b-4b96-b755-ac59b97d9baf" />  

10.	Buat 2 method untuk menampilkan data ke masing masing table  
Method tab 1:  
 <img width="873" height="508" alt="image" src="https://github.com/user-attachments/assets/8dfcfcae-bc4f-4a92-8870-71bb68ed8e91" />  

Method tab2:  
 <img width="940" height="622" alt="image" src="https://github.com/user-attachments/assets/1f6ba877-1241-4e72-901c-2b74efdf5113" />    

11.	Setelah semua selesai maka program bisa dijalankan  
Tab 1:  
 <img width="716" height="559" alt="image" src="https://github.com/user-attachments/assets/a086a9f8-ed32-4f5e-9ca8-00e89c5f3bb0" />  

Tab 2:  
 <img width="714" height="559" alt="image" src="https://github.com/user-attachments/assets/99293628-306d-429a-8046-0c4a1d6376e1" />  


