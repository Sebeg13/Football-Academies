package lauks.sebastian.footballacademies.model.news

import lauks.sebastian.footballacademies.model.User
import java.util.*

data class News(var id: String="-1", val author: User,var academyId: String="-1", var title: String, var content: String, val creationDate: Long) {

}