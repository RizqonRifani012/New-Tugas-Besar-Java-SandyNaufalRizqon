/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbsandynaufalrizqon;

import java.util.Scanner;

/**
 *
 * @author Sand
 */
public class LogicKelas extends Hitung {

    InstanceClass kelas = new InstanceClass();
	Scanner input;
		
	public void IdentitasRuangKelas(){
		input = new Scanner (System.in);
		
		System.out.println("\t\t\t\t\t\t\t~ IDENTITY OF THE CLASS ~\n");
		
		System.out.print("Silahkan Masukkan Nama Ruang : ");
		kelas.setNamaRuang(input.next());
			
		System.out.print("Silahkan Masukkan Lokasi Ruang : ");
		kelas.setLokasiRuang(input.next());
		
		System.out.println("1. Fakultas Agama Islam");
		System.out.println("2. Fakultas Peternakan dan Pertanian");
		System.out.println("3. Fakultas Teknik");
		System.out.println("4. Fakultas Ekonomi dan Bisnis");
		System.out.println("5. Fakultas Keguruan dan Ilmu Pendidikan");
		System.out.println("6. Fakultas Ilmu Sosial dan Pemerintahan");
		System.out.println("7. Fakultas Ilmu Kesehatan ");
		System.out.println("8. Fakultas Hukum ");
		System.out.print("Pilih Fakultas anda dengan memasukkan nomor Fakultas : ");
		kelas.ProgramSF = input.nextInt();
		
		System.out.println("\nNama Ruang : "+ kelas.getNamaRuang());
		System.out.println("Lokasi Ruang : "+ kelas.getLokasiRuang());
			
		if (kelas.ProgramSF == 1){
			System.out.println("Selamat Datang di Fakultas Agama Islam");
		}
		else if(kelas.ProgramSF == 2){
			System.out.println("Selamat Datang di Fakultas Peternakan dan Pertanian");
		}
		else if(kelas.ProgramSF == 3){
			System.out.println("Selamat Datang di Fakultas Teknik");
		}
		else if(kelas.ProgramSF == 4 ){
			System.out.println("Selamat Datang di Fakultas Ekonomi dan Bisnis");
		}
		else if(kelas.ProgramSF == 5 ){
			System.out.println("Selamat Datang di Fakultas Keguruan dan Ilmu Pendidikan");
		}
		else if(kelas.ProgramSF == 6 ){
			System.out.println("Selamat Datang di Fakultas Ilmu Sosial dan Pemerintahan");
		}
		else if(kelas.ProgramSF == 7 ){
			System.out.println("Selamat Datang diFakultas Ilmu Kesehatan");
		}
		else if(kelas.ProgramSF == 8 ){
			System.out.println("Selamat Datang di Fakultas Hukum\n");
		}
		else{
			System.out.println("Fakultas Anda Tidak Dikenali Sistem\n");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////
	
	void KondisiRuangKelas(){
		kelas.inputKondisiRuangKelas();
		if (kelas.getPanjangRuangKelas()!= kelas.luas()){
		System.out.println("\nPanjang Ruang Kelas Sesuai");
                jumlah++;
		}
		else{
			System.out.println("Panjang Ruang Kelas Tidak Sesuai");
		}
		if (kelas.rasioLuas()>=0.5){
			System.out.println("Rasio Sesuai");
                        jumlah++;
		}
                
		else{
			System.out.println("Rasio Tidak Sesuai");
		}	
		if(kelas.getJumlahPintu()>=2){
			System.out.println("Jumlah Pintu Sesuai");
                        jumlah++;
		}
		else{
			System.out.println("Jumlah Pintu Tidak Sesuai");
		}
		if(kelas.getJumlahJendela()>=1){
			System.out.println("Jumlah Jendela Sesuai"); jumlah++;
		}
		else{
			System.out.println("Jumlah Jendela Tidak Sesuai");
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	void JumlahKondisiPosisiSarana(){
		kelas.jumlahKondisiPosisiSarana();
		
		//STOP KONTAK
		System.out.println("\n\t*Analisis Kelistrikan*");
		
		if (kelas.getJumlahStopKontak() >= 4){
			System.out.println("Jumlah Stop Kontak Sesuai"); jumlah++;
		}
		else if(kelas.getJumlahStopKontak() <4){
			System.out.println("Jumlah Stop Kontak Tidak Sesuai");
		}
		if(kelas.getKondisiStopKontak().equals("Baik") && kelas.getJumlahStopKontak()==4){
			System.out.println("Kondisi Stop Kontak Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Stop Kontak Tidak Sesuai");
		}
		if(kelas.getPosisiStopKontak().equals("DekatDosen") || kelas.getPosisiStopKontak().equals("DipojokRuangan")){
			System.out.println("Posisi Stop Kontak Sesuai"); jumlah++;
		}
		else{
			System.out.println("Posisi Stop Kontak Tidak Sesuai");
		}
		
		//LCD
		System.out.println("\t*Analisis LCD*");
		if(kelas.getJumlahKabelLCD()>=1){
			System.out.println("Jumlah Kabel LCD Sesuai"); jumlah++;
		}
		else{
			System.out.println("Jumlah Kabel LCD Tidak Sesuai");
		}
		if(kelas.getKondisiKabelLCD().equals("Berfungsi")){
			System.out.println("Kondisi Kabel LCD Sesuai"); jumlah++;
		}
		else{
			System.out.println("Kondisi Kabel LCD Tidak Sesuai");
		}
		if(kelas.getPosisiKabelLCD().equals("Dekat Dosen")){
			System.out.println("Posisi Kabel LCD Sesuai");
		}
		else{
			System.out.println("Posisi Kabel LCD Tidak Sesuai");
		}
		
		//LAMPU
		System.out.println("\t*Analisis Lampu*");
		if(kelas.getJumlahLampu()>=18){
			System.out.println("Jumlah Lampu Sesuai");
		}
		else{
			System.out.println("Jumlah Lampu Tidak Sesuai");
		}
		if(kelas.getKondisiLampu().equals("BAIK")&& kelas.getJumlahLampu() == 18){
			System.out.println("Kondisi Lampu Sesuai");
		}
		else{
			System.out.println("Kondisi Lampu Tidak Sesuai");
		}
		if(kelas.getPosisiLampu().equals("atap ruangan")){
			System.out.println("Posisi Lampu Sesuai");
		}
		else{
			System.out.println("Posisi Lampu Tidak Sesuai");
		}
		
		//KIPAS ANGIN
		System.out.println("\t*Analisis Kipas Angin*");
		if(kelas.getJumlahKipasAngin() == 2){
			System.out.println("Jumlah Kipas Angin Sesuai");
		}
		else{
			System.out.println("Jumlah Kipas Angin Tidak Sesuai");
		}
		if(kelas.getKondisiKipasAngin().equals("BAIK") && kelas.getJumlahKipasAngin() == 2){
			System.out.println("Kondisi Kipas Angin Sesuai");
		}
		else{
			System.out.println("Kondisi Kipas Angin Tidak Sesuai");
		}
		if(kelas.getPosisiKipasAngin().equals("atap ruangan")){
			System.out.println("Posisi Kipas Angin Sesuai");
		}
		else{
			System.out.println("Posisi Kipas Angin Tidak Sesuai");
		}
		
		//AC
		System.out.println("\t*Analisis AC*");
		if(kelas.getJumlahAC() >= 1){
			System.out.println("Jumlah AC Sesuai");
		}
		else{
			System.out.println("Jumlah AC Tidak Sesuai");
		}
		if(kelas.getKondisiAC().equals("BAIK")){
			System.out.println("Kondisi AC Sesuai");
		}
		else{
			System.out.println("Kondisi AC Tidak Sesuai");
		}
		if(kelas.getPosisiAC().equals("didepan")||kelas.getPosisiAC().equals("dibelakang")){
			System.out.println("Posisi AC Sesuai");
		}
		else{
			System.out.println("Posisi AC Tidak Sesuai");
		}
		
		//SSID
		
		//BANDWIDTH
		
		//CCTV
		System.out.println("\t*Analisis CCTV*");
		if(kelas.getJumlahCCTV() == 2){
			System.out.println("Jumlah CCTV Sesuai");
		}
		else{
			System.out.println("Jumlah CCTV Tidak Sesuai");
		}
		if(kelas.getKondisiCCTV().equals("BAIK")){
			System.out.println("Kondisi CCTV Sesuai");
		}
		else{
			System.out.println("Kondisi CCTV Tidak Sesuai");
		}
		if(kelas.getPosisiCCTV().equals("dibelakang")||kelas.getPosisiCCTV().equals("disamping")){
			System.out.println("Posisi CCTV Sesuai");
		}
		else{
			System.out.println("Posisi CCTV Tidak Sesuai");
                        
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
		
	void LingkunganRuangKelas(){
		kelas.inputLingkunganRuangKelas();
		
		//LANTAI
		System.out.println("\n\t*Analisis Kebersihan*");
		if(kelas.getKondisiLantai().equals("BERSIH")){
			System.out.println("Kondisi Lantai Sesuai");
		}
		else{
			System.out.println("Kondisi Lantai Tidak Sesuai");
		}
		
		//DINDING
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiDinding().equals("BERSIH")){
			System.out.println("Kondisi Dinding Sesuai");
		}
		else{
			System.out.println("Kondisi Dinding Tidak Sesuai");
		}
		
		//ATAP
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiAtap().equals("BERSIH")){
			System.out.println("Kondisi Atap Sesuai");
		}
		else{
			System.out.println("Kondisi Atap Tidak Sesuai");
		}
		
		//PINTU
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiPintu().equals("BERSIH")){
			System.out.println("Kondisi Pintu Sesuai");
		}
		else{
			System.out.println("Kondisi Pintu Tidak Sesuai");
		}
		
		//JENDELA
		System.out.println("\t*Analisis Kebersihan*");
		if(kelas.getKondisiJendela().equals("BERSIH")){
			System.out.println("Kondisi Jendela Sesuai");
		}
		else{
			System.out.println("Kondisi Jendela Tidak Sesuai");
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
	void KebersihanRuangKelas(){
		kelas.inputKebersihanRuangKelas();	
		
		//SIRKULASIUDARA
		System.out.println("\n\t*Analisis Sirkulasi Udara*");
		if(kelas.getSirkulasiUdara().equals("Lancar")){
			System.out.println("Sirkulasi Udara Sesuai");
		}
		else{
			System.out.println("Sirkulasi Udara Tidak Sesuai");
		}
		
		//PENCAHAYAAN
		System.out.println("\t*Analisis Pencahayaan*");
		if(kelas.getNilaiPencahayaan() == 250){
			System.out.println("Pencahayaan Sesuai");
		}
		else{
			System.out.println("Pencahayaan Tidak Sesuai");
		}
		if(kelas.getNilaiPencahayaan() == 350){
			System.out.println("Pencahayaan Sesuai");
		}
		else{
			System.out.println("Pencahayaan Tidak Sesuai");
		}
		
		//KELEMBAPAN
		System.out.println("\t*Analisis Kelembapan*");
		if(kelas.getKelembapan() == 70 ){
			System.out.println("Kelembapan Sesuai");
		}
		else{
			System.out.println("Kelembapan Tidak Sesuai");
		}
		if(kelas.getKelembapan() == 80 ){
			System.out.println("Kelembapan Sesuai");
		}
		else{
			System.out.println("Kelembapan Tidak Sesuai");
		}
		
		//SUHU
		System.out.println("\t*Analisis Suhu*");
		if(kelas.getSuhu() == 25){
			System.out.println("Suhu Sesuai");
		}
		else{
			System.out.println("Suhu Tidak Sesuai");
		}
		if(kelas.getSuhu() == 35){
			System.out.println("Suhu Sesuai");
		}
		else{
			System.out.println("Suhu Tidak Sesuai");
		}
	}
		
//////////////////////////////////////////////////////////////////////////////////////////////

	void KenyamananRuangKelas(){
		kelas.inputKenyamananRuangKelas();	
		
		//KEBISINGAN
		System.out.println("\n\t*Analisis Kebisingan*");
		if(kelas.Kebisingan().equals("Tidak Bising")){
			System.out.println("Kebisingan Sesuai");
		}
		else{
			System.out.println("Kebisingan Tidak Sesuai");
		}
		
		//BAU
		System.out.println("\t*Analisis Bau*");
		if(kelas.getBau().equals("Tidak Bau")){
			System.out.println("Bau Sesuai");
		}
		else{
			System.out.println("Bau Tidak Sesuai");
		}
		
		//KEBOCORAN
		System.out.println("\t*Analisis Kebocoran*");
		if(kelas.getKebocoran().equals("Tidak Bocor")){
			System.out.println("Kebocoran Sesuai");
		}
		else{
			System.out.println("Kebocoran Tidak Sesuai");
		}
		
		//KERUSAKAN
		System.out.println("\t*Analisis Kerusakan*");
		if(kelas.getKerusakan().equals("Tidak Rusak")){
			System.out.println("Kerusakan Sesuai");
		}
		else{
			System.out.println("Kerusakan Tidak Sesuai");
		}
		
		//KEAUSAN
		System.out.println("\t*Analisis Keausan*");
		if(kelas.getKeausan().equals("Tidak Aus")){
			System.out.println("Keausan Sesuai");
		}
		else{
			System.out.println("Keausan Tidak Sesuai");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////

	void KeamananRuangKelas(){
		kelas.inputKeamananRuangKelas();	
			
		//KEKOKOHAN
		System.out.println("\n\t*Analisis Kekokohan*");
		if(kelas.getKekokohan().equals("Kokoh")){
			System.out.println("Kekokohan Sesuai");
		}
		else{
			System.out.println("Kekokohan Tidak Sesuai");
		}
		
		//KUNCI PINTU DAN JENDELA
		System.out.println("\t*Analisis Kunci Pintu dan Jendela*");
		if(kelas.getKunciPintuDanJendela().equals("Ada")){
			System.out.println("Kunci Pintu dan Jendela Sesuai");
		}
		else{
			System.out.println("Kunci Pintu dan Jendela Tidak Sesuai");
		}
		
		//BAHAYA
		System.out.println("\t*Analisis Bahaya*");
		if(kelas.getBahaya().equals("Aman")){
			System.out.println("Bahaya Sesuai");
		}
		else{
			System.out.println("Bahaya Tidak Sesuai");
		}	
	}
}


