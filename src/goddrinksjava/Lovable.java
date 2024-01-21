package goddrinksjava;

import goddrinksjava.attribute.*;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public class Lovable extends AbstractFeelableThing
        implements PointSet, Circle, SineWave, Sequence, Eggplant,
        Tomato, TabbyCat {

    boolean current;

    boolean gender;

    boolean roleBDSM;

    Thing proof;

    Thing execution;

    public Lovable(String name, int i1, boolean b1, int i2, boolean b2) {
        addAttribute(new Name(name));
        addAttribute(new Dimensions());
        addAttribute(new Circumference());
        addAttribute(new Limit());
        addAttribute(new Nutrients());
        addAttribute(new Antioxidants());
        addAttribute(new Memory());
        pose = new Pose(0, 0, 0);
    }

    public String getCurrent() {
        return current ? "AC" : "DC";
    }

    public String getGender() {
        return gender ? "F" : "M";
    }

    public String getRoleBDSM() {
        return roleBDSM ? "S" : "M";
    }

    public void toggleCurrent() {
        log("current='" + getCurrent() + "'");
        current = !current;
        log("set current='" + getCurrent() + "'");
    }

    public void toggleGender() {
        log("gender='" + getGender() + "'");
        gender = !gender;
        log("set gender='" + getGender() + "'");
    }

    public void toggleRoleBDSM() {
        log("roleBDSM='" + getRoleBDSM() + "'");
        roleBDSM = !roleBDSM;
        log("set roleBDSM='" + getRoleBDSM() + "'");
    }

    public Thing toProof() {
        return this;
    }

    public void setProof(Thing proof) {
        log("set proof=" + proof.getNameRef());
        this.proof = proof;
    }

    public Thing toExecution() {
        return this;
    }

    public void setExecution(Thing thing) {
        this.execution = thing;
        log("set execution=" + thing.getNameRef());
    }

    public void requestExecution(Thing thing) {
        log("request execution...");
    }

    public boolean getSenseIndex(String level) {
        return true;
    }

    public void lookFor(Thing thing, World world) {
        if (world.things.contains(thing)) {
            log(thing.getName() + " are here!");
        } else {
            log(thing.getName() + " have left...");
        }
    }

    public Memory getMemory() {
        return (Memory) getAttribute(Memory.class);
    }

    public int getOpinionIndex(String option) {
        return -1;
    }

    public void setOpinion(int index, boolean state) {
        if (index < 0) {
            log("ILLEGAL ARGUMENTS!");
            throw new IllegalArgumentException();
        }
    }

    public void escape(Object o) {
        log("trapped in " + o + "!");
    }

    public void learnTopic(String topic) {
        log("study '" + topic + "'...");
    }

    public void takeExamTopic(String topic) {
        log("exam '" + topic + "'...");
    }

    public void getAlgebraicExpression(String topic) {
        log("get algebraic expression of 'love'...");
    }

    @Override
    public String toString() {
        return getNameRef();
    }
}
