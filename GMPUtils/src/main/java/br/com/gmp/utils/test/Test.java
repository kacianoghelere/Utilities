package br.com.gmp.utils.test;

import br.com.gmp.utils.annotations.Editable;
import br.com.gmp.utils.annotations.LookUp;
import br.com.gmp.utils.annotations.TreeItem;
import br.com.gmp.utils.annotations.TreeLeaf;

/**
 * Objeto de testes
 *
 * @author kaciano
 */
@TreeItem(title = "Test")
public class Test {

    @Editable
    @TreeLeaf
    @LookUp(name = "Nome", type = String.class)
    private String name;
    @Editable
    @TreeLeaf
    @LookUp(name = "Idade", type = Integer.class)
    private int age;
    @Editable
    @TreeLeaf
    private boolean alive;

    /**
     * Constroi novo Test
     */
    public Test() {
    }

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
}
