package ModuloUtilidades;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
        public enum Nivel {
            DEBUG, INFO, ADVERTENCIA, ERROR
        }

        private static final String ARCHIVO_LOG = "logs/sistema.log";
        private static final DateTimeFormatter FORMATO_FECHA =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        private static Nivel nivelActual = Nivel.INFO;

        public static void configurarNivel(Nivel nivel) {
            nivelActual = nivel;
        }

        public static void debug(String mensaje, String usuario) {
            registrar(Nivel.DEBUG, mensaje, usuario);
        }

        public static void info(String mensaje, String usuario) {
            registrar(Nivel.INFO, mensaje, usuario);
        }

        public static void advertencia(String mensaje, String usuario) {
            registrar(Nivel.ADVERTENCIA, mensaje, usuario);
        }

        public static void error(String mensaje, String usuario) {
            registrar(Nivel.ERROR, mensaje, usuario);
        }

        private static void registrar(Nivel nivel, String mensaje, String usuario) {
            if (nivel.ordinal() < nivelActual.ordinal()) {
                return;
            }

            String registro = String.format("[%s] [%s] [%s] - %s%n",
                    LocalDateTime.now().format(FORMATO_FECHA),
                    nivel,
                    usuario,
                    mensaje);

            escribirEnArchivo(registro);
        }

    private static void escribirEnArchivo(String registro) {
        try {

            File directorioLogs = new File("logs");
            if (!directorioLogs.exists()) {
                directorioLogs.mkdir();
            }


            File archivoLog = new File(ARCHIVO_LOG);


            if (!archivoLog.exists()) {
                archivoLog.createNewFile();
            }


            FileWriter fw = new FileWriter(archivoLog, true); // true para append
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(registro);
            bw.close();
        } catch (IOException e) {
            System.err.println("Error crítico al escribir en log: " + e.getMessage());

        }
    }
    private static void imprimirEnConsola(String registro) {
        // Códigos ANSI para colores
        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String AMARILLO = "\u001B[33m";
        final String AZUL = "\u001B[34m";
        final String VERDE = "\u001B[32m";

        try {
            String nivel = registro.split("\\[")[2].split("\\]")[0];

            switch(nivel) {
                case "ERROR":
                    System.err.print(ROJO + registro + RESET);
                    break;
                case "ADVERTENCIA":
                    System.err.print(AMARILLO + registro + RESET);
                    break;
                case "INFO":
                    System.out.print(VERDE + registro + RESET);
                    break;
                case "DEBUG":
                    System.out.print(AZUL + registro + RESET);
                    break;
                default:
                    System.out.print(registro);
            }
        } catch (Exception e) {
            System.out.print(registro);
        }
    }
    }

