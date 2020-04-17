enum Levels {
    ZERO("LOW"),//meant for view only
    ONE("MEDIUM"),//meant for view update e.g assign asset to recruits
    TWO("HIGH"),//can add or update new or assistant technician,assets specs into the system
    SUPERUSER("ALL");//can add or update new or old technician,assets into the system; can assign assets to recruits

    Levels(String lvls){

    }
}
