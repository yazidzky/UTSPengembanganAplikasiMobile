# 🍽️ Mesen Makanan – Proyek UTS (Kotlin, Android Studio)

**Nama APK**: Mesen Makanan  
**Package**: `com.example.utsmakananapp`  
**Bahasa**: Kotlin (100%)  
**Minimum SDK**: API 27 (Android 8.1 Oreo) – kompatibel dengan JDK 8  
**Arsitektur**: Single-Activity berbasis Intent (tanpa database)  
**Layout**: Seluruh screen menggunakan `ConstraintLayout`  
**Tema**: Clean & minimalis  
🎨 **Warna utama**: `#333333`  
🎨 **Warna sekunder**: `#BBBBBB`

---

## 📱 1. Fitur Utama
- Splash sederhana → Sign-up / Login → Home (pilih makanan) → Order → Alamat → Konfirmasi  
- Tersedia **8 kuliner khas Bandung**:
  - Combro  
  - Batagor  
  - Seblak  
  - Surabi  
  - Cilok  
  - Cimol  
  - Cireng  
  - Cuanki  
  - Lotek  
  - Peuyeum  
- Makanan ditampilkan dalam **CardView** yang bisa discroll.  
- Klik item langsung membuka halaman pemesanan (`Intent` berisi nama makanan).  
- **Bottom Navigation**: Home – Order – Profile (ikon vektor).  
- **Tanpa database** – data antar screen dikirim via `Intent.putExtra()`.  
- **Tombol back-toolbar** aktif di screen tertentu untuk navigasi balik.

---

## 🧭 2. Struktur Screen & Alur
| No | Activity | Deskripsi |
|----|-----------|-----------|
| 1 | `MainActivity` | Splash / Welcome (“Mesen Makanan”) |
| 2 | `SignupActivity` | Pilihan Register / Login |
| 3 | `LoginActivity` | Form login (Username, Password) |
| 4 | `RegisterActivity` | Register (Nama Lengkap, Username, Password) |
| 5 | `HomeActivity` | Daftar makanan → klik item menuju Order |
| 6 | `OrderActivity` | Tampilkan makanan yang dipilih |
| 7 | `AddressActivity` | Input nama, alamat, patokan |
| 8 | `ConfirmationActivity` | Ucapan terima kasih & konfirmasi pemesanan |

---

## ⚙️ 3. Teknologi & Library
- **Kotlin** 1.8+  
- **AndroidX AppCompat**  
- **ConstraintLayout**  
- **Material Components** (`BottomNavigationView`, `CardView`)  
- **Vector Drawable** untuk ikon (`ic_home`, `ic_calendar`, `ic_person`)

---

## 🚀 4. Cara Build & Run
1. Clone atau ekstrak proyek ke **Android Studio**.  
2. Pastikan **JDK 8** dan **compileSdk 33** (atau versi terbaru) sudah terinstal.  
3. Lakukan **Gradle Sync**.  
4. Jalankan (Run / Shift + F10) di emulator atau device dengan **API 27+**.

---

## 📨 5. Skema Intent Extra
| Key | Tipe | Asal → Tujuan | Keterangan |
|------|------|----------------|-------------|
| `makanan` | String | Home → Order | Nama makanan yang dipilih |
| `namaLengkap` | String | Register → Home → Order → dst. | Nama pengguna untuk sapaan |
| `alamat` | String | Address → Confirmation | Alamat lengkap pengiriman |
| `patokan` | String | Address → Confirmation | Detail tambahan lokasi |

---

## 🧩 6. Assets & Drawable
| File | Keterangan |
|------|-------------|
| `ic_home.xml`, `ic_calendar.xml`, `ic_person.xml` | Ikon untuk bottom navigation |
| `ic_smile.xml` | Placeholder gambar makanan |
| `rounded_item_background.xml` | Background dengan radius 8dp |
| `circle_background.xml` | Background berbentuk lingkaran |

---

## ⚡ 7. Penyesuaian Cepat
- **Tambah item baru**:  
Duplikat block `itemXXX` di `activity_home.xml`, lalu daftarkan ID & listener di `HomeActivity.kt`.  
- **Ubah warna utama**:  
Ganti `android:backgroundTint="#333333"` di semua tombol utama.  
- **Gunakan database (opsional)**:  
Ubah sistem `Intent` ke Room / Firebase pada layer `ViewModel`.

---

## 📄 8.Screenshot
<img width="1080" height="2400" alt="Screenshot_20251101_205730" src="https://github.com/user-attachments/assets/42be05ac-36a7-426a-8779-e62529849997" />
<img width="1080" height="2400" alt="Screenshot_20251101_205856" src="https://github.com/user-attachments/assets/84f585f4-64d6-4de0-843e-1a1840a8f579" />
<img width="1080" height="2400" alt="Screenshot_20251101_205905" src="https://github.com/user-attachments/assets/8bc47c4b-bfdd-43b3-a79a-0b422a3ac76b" />
<img width="1080" height="2400" alt="Screenshot_20251101_205913" src="https://github.com/user-attachments/assets/8a9714ea-3014-4f51-ae24-c843cc582264" />
<img width="1080" height="2400" alt="Screenshot_20251101_205931" src="https://github.com/user-attachments/assets/929c9186-9eb7-4c37-8143-e6c0007eda8d" />
<img width="1080" height="2400" alt="Screenshot_20251101_210011" src="https://github.com/user-attachments/assets/7e6e3a76-f1b6-4e3e-a97f-8feb224af490" />
<img width="1080" height="2400" alt="Screenshot_20251101_210027" src="https://github.com/user-attachments/assets/132fa225-0951-4799-a292-e8d719bdc861" />
<img width="1080" height="2400" alt="Screenshot_20251101_210040" src="https://github.com/user-attachments/assets/6e694d7a-f7f5-4ac3-b29b-83b008ec4282" />
<img width="1080" height="2400" alt="Screenshot_20251101_210745" src="https://github.com/user-attachments/assets/3c79e489-acf8-4747-a09f-c7e2ff4caccd" />









