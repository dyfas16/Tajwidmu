package com.tajwidmu

object Constants {

    const val USER_NAME: String = "user name"
    const val TOTAL_PERTANYAAN: String = "total_question"
    const val TRUE_REPLY: String = "true reply"

    fun getPertanyaan(): ArrayList<Pertanyaan> {
        val pertanyaanList = ArrayList<Pertanyaan>()

        val pert1 = Pertanyaan(
            1,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.idghom_bigunnah,
            "Idzhar",
            "Idghom Bigunnah",
            "Mad Thobi'i",
            "Qolqolah Sugro",
            2
        )
        pertanyaanList.add(pert1)

        val pert2 = Pertanyaan(
            2,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.idghom_billagunnah,
            "Ikhfa",
            "Idghom Bigunnah",
            "iqlab",
            "Idghom Billagunnah",
            4
        )
        pertanyaanList.add(pert2)

        val pert3 = Pertanyaan(
            3,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.idzhar,
            "Idzhar",
            "Ikhfa Syafawi",
            "Iqlab",
            "Qolqolah Kubro",
            1
        )
        pertanyaanList.add(pert3)

        val pert4 = Pertanyaan(
            4,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.idzhar_syafawi,
            "Idzhar",
            "Idghom Bigunnah",
            "Mad Thobi'i",
            "Iqlab",
            3
        )
        pertanyaanList.add(pert4)

        val pert5 = Pertanyaan(
            5,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.ikhfa_haqiqi,
            "Idzhar Syafawi",
            "Idghom Billagunnah",
            "Ikhfa Haqiqi",
            "Qolqolah Sugro",
            3
        )
        pertanyaanList.add(pert5)

        val pert6 = Pertanyaan(
            6,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.ikhfa_syafawi,
            "Idghom Bigunnah",
            "Ikhfa Syafawi",
            "Qolqolah Sugro",
            "Iqlab",
            2
        )
        pertanyaanList.add(pert6)

        val pert7 = Pertanyaan(
            7,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.iqlab,
            "Qolqolah Kubro",
            "Idghom Billagunnah",
            "Ikhfa Syafawi,",
            "Iqlab",
            4
        )
        pertanyaanList.add(pert7)

        val pert8 = Pertanyaan(
            8,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.mad_thobi,
            "Idzhar Syafawi",
            "Idghom Bigunnah",
            "Mad Thobi'i",
            "Ikhfa Syafawi",
            3
        )
        pertanyaanList.add(pert8)

        val pert9 = Pertanyaan(
            9,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.qolqolah_kubro,
            "Idzhar",
            "Qolqolah Sugro",
            "Mad Thob'i",
            "Qolqolah Kubro",
            2
        )
        pertanyaanList.add(pert9)

        val pert10 = Pertanyaan(
            10,
            "Apa jenis tajwid dibawah ini?",
            R.drawable.qolqolah_sugro,
            "Qolqolah Sugro",
            "Idzhar",
            "Ikhfa Haqiqi",
            "Qolqolah Kubro",
            1
        )
        pertanyaanList.add(pert10)
        return pertanyaanList
    }
}