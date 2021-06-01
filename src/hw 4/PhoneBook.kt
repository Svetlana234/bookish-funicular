package `hw 4`

import java.util.ArrayList
import java.util.HashMap

class PhoneBook {
    private val book = HashMap<String, String>()
    fun addContact(phone: String, surName: String) {
        book[phone] = surName
    }

    fun getPhones(surname: String): List<String> {
        val phones = ArrayList<String>()
        for ((key, value) in book) {
            if (value == surname) {
                phones.add(key)
            }
        }
        return phones
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val phoneBook = PhoneBook()
            phoneBook.addContact("123423", "Иванов")
            phoneBook.addContact("234", "Сидоров")
            phoneBook.addContact("23456556777", "Иванов")
            phoneBook.addContact("6534", "Петров")
            println(phoneBook.getPhones("Сидоров"))
        }
    }
}