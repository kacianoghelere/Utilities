package br.com.gmp.utils.system;

/**
 * Coleção de propriedades do sistema
 *
 * @author kaciano
 */
public interface SystemProperties {

    public String OS_NAME = System.getProperties().getProperty("os.name");
    public String OS_ARCH = System.getProperties().getProperty("os.arch");
    public String USER_NAME = System.getProperties().getProperty("user.name");
    public String USER_HOME = System.getProperties().getProperty("user.home");
    public String USER_TIMEZONE = System.getProperties().getProperty("user.timezone");
    public String SYSTEM_ENCODING = System.getProperties().getProperty("sun.jnu.encoding");
    public String FILE_ENCODING = System.getProperties().getProperty("file.encoding");
    public String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
    public String JAVA_RUNTIME_VERSION = System.getProperties().getProperty("java.runtime.version");
    public String JAVA_VERSION = System.getProperties().getProperty("java.version");
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
