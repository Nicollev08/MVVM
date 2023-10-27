package com.example.mvvm.model
class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "Dos cosas son infinitas: la estupidez humana y el universo; y no estoy seguro de lo segundo.",
                author = "Albert Einstein."
            ),
            QuoteModel(
                quote = "Que no hay pajaros en último piso no quiere decir que no haya cielo.",
                author = "Mario Benedetti."
            ),
            QuoteModel(
                quote = "Soñar, después de todo, es un modo de viajar.",
                author = "William Hazlitt."
            ),
            QuoteModel(
                quote = "La poesía es el eco de la melodía del universo en el corazón de los humanos.",
                author = "Rabindranath Tagore."
            ),
            QuoteModel(
                quote = "Nuestro miedo más profundo no es que seamos inadecuados. Nuestro miedo más profundo es que somos poderosos más allá de toda medida.",
                author = "Marianne Williamson."
            ),
            QuoteModel(
                quote = " No te rindas, por favor no cedas, aunque el frío queme, aunque el miedo muerda, aunque el sol se esconda, y se calle el viento. ",
                author = "Mario Benedetti."
            ),
            QuoteModel(
                quote = "Si me dieran a elegir entre tú y la primavera, elegiría tu mirada porque la primavera la inventaron los pintores.",
                author = " Juan Gelman."
            ),
            QuoteModel(quote = "A veces el corazón ve lo que es invisible a los ojos.",
                author = "H. Jackson Brown Jr."
            ),
            QuoteModel(quote = " La poesía es la emoción que encuentra su pensamiento y el pensamiento que encuentra su emoción.",
                author = "Robert Frost."
            ),
            QuoteModel(quote = "Si no sabes dónde ir, cualquier camino te llevará allí.",
                author = "Lewis Carroll."
            ),
            QuoteModel(quote = "El alma que hablar puede con los ojos, también puede besar con la mirada.",
                author = "Gustavo Adolfo Bécquer.")
        )
    }
}