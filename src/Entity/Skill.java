package Entity;

import Enums.SkillType;
/**
 * Класс <b>Навыков</b> с параметрами: <b>level</b>, <b>points</b> и <b>skillType</b>.
 * @author Glukhov K. A.
 * @version 0.0.6
 * @since 0.0.3
*/
public class Skill {

    /** Параметр <b>Уровень навыка</b> */
    private int level;

    /** Параметр <b>Очки навыка</b> */
    private int points;

    /** Параметр <b>Тип навыка</b>
    * @see SkillType */
    public SkillType skillType;

    /**
     * Конструктор - создание экземпляра класса <b>Навыков</b>
     * @param skillType наименование навыка
     * @see SkillType
    */
    public Skill(SkillType skillType) {
        this.skillType = skillType;
    }

    /**
     * Функция получения значения параметра {@link Skill#level}
     * @return уровень навыка
    */
    public int getLevel() {
        return level;
    }

    /**
     * Процедура присваивания значения параметру {@link Skill#level}
     * @param lvl уровень
    */
    private void setLevel(int lvl){
        this.level = lvl;
    }

    /**
     * Функция получения значения параметра {@link Skill#points}
     * @return количество очков навыка
    */
    public int getPoints() {
        return points;
    }

    /**
     * Функция повышения уровня навыка
     */
    public String levelUp(){
        int curPoints= getPoints();
        for (int i = 1; i <= 5; i++) {
            if (curPoints >= (10 * Math.pow(2,i-1)) & (curPoints < (10 * Math.pow(2,i)))){
                setLevel(i);
                return "Навыка " + skillType.toString() + " повышен до " + getLevel() + " уровня!";
            }
        }
        return "";
    }

    /**
     * Процедура увеличения значения параметра {@link Skill#level} на заданное число единиц
     * @param points кол-во очков
     */
    public void addPoints(int points) {
            this.points += points;
        System.out.println(levelUp());
    }

    @Override
    public String toString() {
        return  "" + skillType + ":" + '\n' +
                "level=" + level + '\n' +
                "points=" + points + '\n';
    }
}
