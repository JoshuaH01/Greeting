package Game

object FantasyGame extends App {

  val player1: Fighter = new Fighter("Joshua", "Male", 100, "Fighter", new Stamina(100))
  val player2: Frostmage = new Frostmage("", "Male", 80, "Frost Mage", new Mana(300))
  val player3: Paladin = new Paladin("", "Male", 120, "Paladin", new Mana(300))

  val enemy1: Goblin = new Goblin("", "Male", 100, "Fighter", new Gold(30))
  val enemy2: Orc = new Orc("", "Female", 140, "Cleric", new Gold(50))
  val enemy3: DemonDog = new DemonDog("", "Male", 60, "Hunter", new Gold(10))

  class Point(x: Int, y: Int)

}


class Character(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) {
  def Dead = Health >= 0

  def Alive = Health <= 1

  /*def Movement(pos: Point)*/

}

abstract class Resource(amount:Int) {

}

class Health(resource: Int) extends Resource(resource) {}

  /*  def loseStamina(amount: Int): Unit = {
    if ((resource - cost) > 5) {
      println(s"You can't heavy attack!")

    }
  }*/

  class Gold(resource: Int) extends Resource(resource) {
  }

  class Mana(resource: Int) extends Resource(resource) {

  }

  class Rage(resource: Int) extends Resource(resource) {

  }

  class Stamina(resource: Int) extends Resource(resource) {}

  /*  def loseStamina(amount: Int): Unit = {
      if ((resource - heavyattackcost) > 5) {
        println(s"You can't heavy attack!")
      }
    }*/


  abstract class Actions(cost: Int) {

  }

  /*   class Fighterskills(cost: Int, Damage: Int, Healing: Int) extends Actions(cost){}

    class HeavyAttack(cost: Int, Damage: Int) extends Actions(cost)

    val heavyattackcost = 10
    val heavyAttackdamage = 10

    class Fireball(cost: Int, Damage: Int) extends Actions(cost)

    val fireballcost = 15
    val fireballdamage = 7

    class FlashOfLight(cost: Int, Healing: Int) extends Actions(cost)

    val flashOfLightcost = 40
    val flashOfLightheal = 20
  }
*/

  class Fighter(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Character(Name, Gender, Health, Job, Resource) {


  }

  class Berzerker(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Fighter(Name, Gender, Health, Job, Resource) {


  }

  class Knight(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Fighter(Name, Gender, Health, Job, Resource) {


  }

  class Claymore(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Fighter(Name, Gender, Health, Job, Resource) {


  }


  class Magician(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Character(Name, Gender, Health, Job, Resource) {


  }

  class Firemage(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Magician(Name, Gender, Health, Job, Resource) {


  }

  class Frostmage(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Magician(Name, Gender, Health, Job, Resource) {


  }

  class Arcanemage(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Magician(Name, Gender, Health, Job, Resource) {


  }


  class Cleric(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Character(Name, Gender, Health, Job, Resource) {


  }

  class Priest(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Cleric(Name, Gender, Health, Job, Resource) {


  }

  class Paladin(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Cleric(Name, Gender, Health, Job, Resource) {


  }

  class Bard(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Cleric(Name, Gender, Health, Job, Resource) {


  }


  class Ranger(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Character(Name, Gender, Health, Job, Resource) {


  }

  class Hunter(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Ranger(Name, Gender, Health, Job, Resource) {


  }

  class Rogue(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Ranger(Name, Gender, Health, Job, Resource) {


  }

  class Sharpshooter(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Ranger(Name, Gender, Health, Job, Resource) {


  }

  abstract class Enemys(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Character(Name, Gender, Health, Job, Resource) {

  }


  class Goblin(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Enemys(Name, Gender, Health, Job, Resource) {


  }

  class Orc(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Enemys(Name, Gender, Health, Job, Resource) {


  }

  class DemonDog(Name: String, Gender: String, Health: Int, Job: String, Resource: Resource) extends Enemys(Name, Gender, Health, Job, Resource) {
  }



