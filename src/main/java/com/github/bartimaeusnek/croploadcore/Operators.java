package com.github.bartimaeusnek.croploadcore;

public class Operators {
    /**
     * Calculates a percentage in a coustom way
     */
    public static float csig(float input, float modifier, boolean rising) {
        return (float) ((float) 1 + Math.tanh( (rising ? 1.0 : (-1.0)) * (double)input / (double)modifier));
    }
}
