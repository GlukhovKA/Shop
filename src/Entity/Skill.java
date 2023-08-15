package Entity;

import Enums.SkillType;

public class Skill {
    private int level;
    private int points;
    public SkillType skillType;

    public Skill(SkillType skillType) {
        this.skillType = skillType;
    }
    public int getLevel() {
        return level;
    }
    private void setLevel(int lvl){
        this.level = lvl;
    }

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
    public int getPoints() {
        return points;
    }
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
