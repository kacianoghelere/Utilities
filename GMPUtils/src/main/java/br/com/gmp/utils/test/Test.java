package br.com.gmp.utils.test;

import br.com.gmp.utils.annotations.TreeItem;
import br.com.gmp.utils.annotations.TreeLeaf;

/**
 * Objeto de testes
 *
 * @author kaciano
 */
@TreeItem(title = "Test")
public class Test {

    @TreeLeaf
    private String name;
    @TreeLeaf
    private int age;
    @TreeLeaf
    private boolean alive;
    private Test test;

    /**
     * Constroi novo Test
     *
     * @param name Nome
     * @param age Idade
     * @param alive Vivo?
     */
    public Test(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    /**
     * Constroi novo Test
     *
     * @param name Nome
     * @param age Idade
     * @param alive Vivo?
     * @param test Test
     */
    public Test(String name, int age, boolean alive, Test test) {
        this.name = name;
        this.age = age;
        this.alive = alive;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Teste{" + "name=" + name + ", age=" + age + ", vivo=" + alive + '}';
    }

    /**
     * Retorna o nome
     *
     * @return Nome
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica o nome
     *
     * @param name Nome
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna idade
     *
     * @return Idade
     */
    public int getAge() {
        return age;
    }

    /**
     * Modifica idade
     *
     * @param age Idade
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Está vivo?
     *
     * @return vivo?
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Está vivo?
     *
     * @param alive vivo?
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     *
     * @return Test
     */
    public Test getTest() {
        return test;
    }

    /**
     *
     * @param test Test
     */
    public void setTest(Test test) {
        this.test = test;
    }

}
