package br.com.gmp.utils.audio.pressets;

/**
 * Utilitario para catalogo de pre-definicoes do equalizador
 *
 * @author kaciano
 */
public enum Pressets {

    /**
     * Pre-definicao Normal
     */
    NORMAL("Normal", new float[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}),
    /**
     * Pre-definicao Classical
     */
    CLASSICAL("Classical", new float[]{50, 50, 50, 50, 50, 50, 70, 70, 70, 76}),
    /**
     * Pre-definicao Club
     */
    CLUB("Club", new float[]{50, 50, 42, 34, 34, 34, 42, 50, 50, 50}),
    /**
     * Pre-definicao Dance
     */
    DANCE("Dance", new float[]{26, 34, 46, 50, 50, 66, 70, 70, 50, 50}),
    /**
     * Pre-definicao Fullbass
     */
    FULLBASS("Fullbass", new float[]{26, 26, 26, 36, 46, 62, 76, 78, 78, 78}),
    /**
     * Pre-definicao Fullbasstreble
     */
    FULLBASSTREBLE("Fullbasstreble", new float[]{34, 34, 50, 68, 62, 46, 28, 22, 18, 18}),
    /**
     * Pre-definicao Fulltreble
     */
    FULLTREBLE("Fulltreble", new float[]{78, 78, 78, 62, 42, 24, 8, 8, 8, 8}),
    /**
     * Pre-definicao Laptop
     */
    LAPTOP("Laptop", new float[]{38, 22, 36, 60, 58, 46, 38, 24, 16, 14}),
    /**
     * Pre-definicao Live
     */
    LIVE("Live", new float[]{66, 50, 40, 36, 34, 34, 40, 42, 42, 42}),
    /**
     * Pre-definicao Party
     */
    PARTY("Party", new float[]{32, 32, 50, 50, 50, 50, 50, 50, 32, 32}),
    /**
     * Pre-definicao Pop
     */
    POP("Pop", new float[]{56, 38, 32, 30, 38, 54, 56, 56, 54, 54}),
    /**
     * Pre-definicao Reggae
     */
    REGGAE("Reggae", new float[]{48, 48, 50, 66, 48, 34, 34, 48, 48, 48}),
    /**
     * Pre-definicao Rock
     */
    ROCK("Rock", new float[]{32, 38, 64, 72, 56, 40, 28, 24, 24, 24}),
    /**
     * Pre-definicao Techno
     */
    TECHNO("Techno", new float[]{30, 34, 48, 66, 64, 48, 30, 24, 24, 28});

    private String title;
    private float[] pressets;

    /**
     * Cria nova instancia de Pressets
     *
     * @param title {@code String} Titulo da pre-definicao
     * @param pressets {@code float[]} Valores da pre-definicao
     */
    private Pressets(String title, float[] pressets) {
        this.title = title;
        this.pressets = pressets;
    }

    /**
     * Retorna o titulo da pre-definicao
     *
     * @return {@code String} Titulo da pre-definicao
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modifica o titulo da pre-definicao
     *
     * @param title {@code String} Titulo da pre-definicao
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retorna os valores da pre-definicao
     *
     * @return {@code float[]} Valores da pre-definicao
     */
    public float[] getPressets() {
        return pressets;
    }

    /**
     * Modifica os valores da pre-definicao
     *
     * @param pressets {@code float[]} Valores da pre-definicao
     */
    public void setPressets(float[] pressets) {
        this.pressets = pressets;
    }

}
