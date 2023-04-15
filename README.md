# TP2DPBO2023

Saya Zahra Fitria Maharani NIM 2102545 mengerjakan soal TP2 dalam mata kuliah Desain dan Pemrograman Berbasis Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## ALUR PROGRAM

Terdapat beberapa fitur yang dapat digunakan:

1. Insert data
- memasukkan value pada form dan memilih value pada comboBox, kemudian klik tombol Add
- setelah memasukkan data, table akan terupdate dengan data yang baru, kemudian value pada form kosong dan comboBox kembali ke laki-laki
2. Update data
- klik list data mahasiswa pada table, kemudian ubah value form ataupun comboBox sesuai keinginan, kemudian klik tombol Update
- setelah update data, table akan terupdate dengan data yang baru, kemudian value pada form kosong dan comboBox kembali ke laki-laki
3. Delete data 
- klik list data mahasiswa pada table, kemudian klik tombol Delete
- terdapat opsi Yes or No saat menghapus data, ketika klik No, maka data tidak dihapus dan masih dalam keadaan memencet list data tersebut sehingga value pada form dan comboBox sesuai dengan data yang dipencet
- ketika klik Yes, maka data terhapus, kemudian terupdate dengan data yang baru, kemudian value pada form kosong dan comboBox kembali ke laki-laki
4. Cancel data
- klik list data mahasiswa pada table, kemudian klik tombol Cancel
- maka value pada form kosong dan comboBox kembali ke laki-laki
- atau bisa juga ketika sudah mengisi semua data pada form dan comboBox, kemudian klik tombol Cancel
- maka value pada form kosong dan comboBox kembali ke laki-laki

## DESAIN PROGRAM

<img src="https://github.com/zahraftrm/LATIHAN5DPBO2023/blob/main/desain%20program.png" width=50% height=50%>

Terdapat kelas Mahasiswa dan juga kelas untuk Menu. Pada kelas Mahasiswa terdapat 4 atribut, yakni:

1. Atribut Nim      : untuk menampung Nim mahasiswa, data diambil menggunakan textField
2. Atribut Nama     : untuk menampung Nama mahasiswa, data diambil menggunakan textField
3. Atribut Nilai    : untuk menampung Nilai mahasiswa, data diambil menggunakan textField
4. Atribut Gender   : untuk menampung Gender mahasiswa, data diambil menggunakan comboBox yang terdiri dari laki-laki/perempuan

Pada kelas Mahasiswa terdapat method set (untuk menetapkan nilai) dan juga method get (untuk mengambil nilai). Pada kelas Menu memiliki beberapa method, yakni:
1. Method setTable()                      : untuk menetapkan table dengan cara mengambil nilai-nilai yang ada pada atribut Mahasiswa
2. Method insertData()                    : untuk memasukkan data
3. Method updateData()                    : untuk memperbaharui data
4. Method deleteData()                    : untuk menghapus data
5. Method resetForm()                     : untuk mengembalikan value form menjadi kosong
6. Method buttonAddActionPerformed()      : jika tombol Add dipencet, maka kita memanggil method insertData() dan bila tombol Update yg muncul, maka kita memanggil method updateData()
7. Method tblMhsMouseClicked()            : jika mouse meng-click list table
8. Method btnDeleteActonPerformed()       : jika tombol Delete dipencet, maka kita memanggil method deleteData() apabila user setuju menghapus data
9. Method btnCancelActionPerformed()      : jika tombol Cancel dipencet, maka value form menjadi kosong

## SCREENSHOTS PROGRAM

1. Login
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/1.%20Login.png" width=50% height=50%>
2. Tampilan Halaman Utama
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/2.%20Tampilan%20Halaman%20Utama.png" width=50% height=50%>
3. Tampilan Edit Data
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/3.%20Tampilan%20Edit%20Data.png" width=50% height=50%>
4. Data Sudah Diedit
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/4.%20Data%20Sudah%20Diedit.png" width=50% height=50%>
5. Message Dialog Data Terupdate
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/5.%20Message%20Dialog%20Data%20Terupdate.png" width=50% height=50%>
6. Tampilan Halaman Utama Setelah Diupdate
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/6.%20Tampilan%20Halaman%20Utama%20Setelah%20Diupdate.png" width=50% height=50%>
7. Delete Data
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/7.%20Delete%20Data.png" width=50% height=50%>
8. Message Dialog Data Terhapus
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/8.%20Message%20Dialog%20Data%20Terhapus.png" width=50% height=50%>
9. Tampilan Halaman Utama Setelah Dihapus
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/9.%20Tampilan%20Halaman%20Utama%20Setelah%20Dihapus.png" width=50% height=50%>
10. Tambah Data
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/10.%20Tambah%20Data.png" width=50% height=50%>
11. Message Dialog Data Bertambah
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/11.%20Message%20Dialog%20Data%20Bertambah.png" width=50% height=50%>
12. Logout Balik Ke Tampilan Halaman Login
<img src="https://github.com/zahraftrm/TP2DPBO2023/blob/main/Screenshots/12.%20Logout%20Balik%20Ke%20Tampilan%20Halaman%20Login.png" width=50% height=50%>
