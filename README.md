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
5. File APK akan muncul di:
