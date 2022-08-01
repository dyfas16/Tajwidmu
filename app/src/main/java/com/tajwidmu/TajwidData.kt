package com.tajwidmu

object TajwidData {
    private val tajwidNames = arrayOf(
        "Idghom Bigunnah",
        "Idghom Billagunnah",
        "Idzhar",
        "Idzhar Syafawi",
        "Ikhfa Haqiqi",
        "Ikhfa Syafawi",
        "Iqlab",
        "Mad Thobi'i",
        "Qolqolah Kubro",
        "Qolqolah Sugro",

        )

    private val tajwidDetails = arrayOf(
        "Idghom yang artinya mentasydidkan, Yaitu apabila ada Nun Sukun / Nun Mati (نْ) atau ada Tanwin ً  bertemu dengan salah satu huruf hijaiyah  ن , م , و , ي maka suara mendengung.",
        "Jika terdapat Nun Sukun (نْ) atau Tanwin ً  bertemu dengan salah satu huruf hijaiyah ل atau ر hukum bacaannya menjadi mentasydidkan atau memasukan huruf sesudahnya dengan tidak mendengung dan tidak panjang.",
        "Secara harfiah Idzhar berarti menerangkan atau menjelaskan dengan kata lain harus dibaca terang. Idzhar yang apabila ada Nun Sukun / Nun Mati (نْ) atau ada tanwin ً  bertemu dengan huruf   ا  ح  خ  ع  غ  ھ",
        "Yaitu apabila terdapat mim sukun (مْ) bertemu dengan ا,ت,ث,ج,ح,خ,د,ذ,ر,ز,س,ش,ص,ض,ﻁ,ﻅ,ع,غ,ف,ق,ك,ل,ن,و,ه selain م  dan ب maka cara membacanya pendek, terang dan jelas dibibir dengan mulut rapat tertutup.",
        "Ikhfa Haqiqi yang berarti saat menyembunyikan bacaan dibaca samar atau menyembunyikan bentuk aslinya sehingga terdengar mendengung. Ikhfa Haqiqi dibaca apabila terdapat Nun Sukun (نْ) atau Tanwin ً  bertemu dengan salah satu huruf hijaiyah ت, ث, ج, د, ذ, ز, س, ش, ص, ض, ط, ظ, ف, ق, ك",
        "Yaitu apabila terdapat Mim Sukun (مْ) bertemu dengan huruf Ba (ب) maka caranya harus samar-samar dibibir dan didengungkan.",
        "Iqlab yang berarti menukar atau apabila terdapat Nun Sukun (نْ) atau Tanwin ً  bertemu dengan huruf hijaiyah ب hukum bacaanya bersuara mim dengan merapatkan bibir dan mendengung.",
        "Mad secara harfiah berarti panjang dan Thobi’i berarti biasa yaitu apabila terdapat alif (ا) sesudahnya fathah َ , ya sukun (يْ) dan sesudahnya kasrah ِ  , wawu (وْ) sukun dan sesudah nya dhammah ُ  maka bacaan akan dipanjangkan sebanyak satu sampai dua harakat.",
        "Qolqolah yang secara harfiah berarti getaran bunyi yang dipantulkan dari dalam tenggorokan. Qolqolah Kubro yang berarti besar yaitu apabila dari kelima hijaiyah  yang ق ﻁ, ب, ج, د berharakat sukun ه dari sebab waqaf atau titik koma.",
        "Qolqolah yang secara harfiah berarti getaran bunyi yang dipantulkan dari dalam tenggorokan. Qolqolah Sugro yang berarti kecil yaitu apabila terdapat huruf hijaiyah  ق ﻁ, ب, ج, د yang berharakat sukun ه maka dibaca secara bergerak dan berbunyi seperti membalik."
    )

    val listData: ArrayList<Tajwid>
        get() {
            val list = arrayListOf<Tajwid>()
            for (position in tajwidNames.indices) {
                val tajwid = Tajwid()
                tajwid.name = tajwidNames[position]
                tajwid.detail = tajwidDetails[position]
                list.add(tajwid)
            }
            return list
        }
}