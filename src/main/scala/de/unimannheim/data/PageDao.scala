package de.unimannheim.data

/**
  * Created by morph3o on 05.12.16.
  */
case class Page(slug: String, title: String, summary: String, body: String)

object PageDao {
  val page1 = Page("beacon-ipsum",
    "Seculas trabem in regius aboa!",
    """Est dexter rumor, cesaris. Always agreeable witness the boundless lover. You have to rise, and fear awareness by
       your traveling. Lixas potus, tanquam flavum consilium.""",
    """God, clear wench. go to jamaica. Never hoist a gold. Core at the port that is when small c-beams warp.
       Flavum, varius mensas virtualiter fallere de teres, brevis agripeta. Sunt rectores imperium emeritis, magnum
       sagaes.""")

  val page2 = Page("page-ipsum",
    "Seculas trabem in regius aboa!",
    """Est dexter rumor, cesaris. Always agreeable witness the boundless lover. You have to rise, and fear awareness by
       your traveling. Lixas potus, tanquam flavum consilium.""",
    """God, clear wench. go to jamaica. Never hoist a gold. Core at the port that is when small c-beams warp.
       Flavum, varius mensas virtualiter fallere de teres, brevis agripeta. Sunt rectores imperium emeritis, magnum
       sagaes.""")

  val pages = List(page1, page2)
}
