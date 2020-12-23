package src.jokenpo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum JoKenPo {
    PEDRA,
    PAPEL,
    TESOURA;

    // Para gerar uma mão aleatória durante a partida
    private static final List<JoKenPo> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static JoKenPo maoAleatoria()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    @Override
    public String toString() {
        return "JoKenPo{}";
    }
}
