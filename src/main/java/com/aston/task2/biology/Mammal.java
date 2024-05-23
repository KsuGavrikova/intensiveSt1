package com.aston.task2.biology;

public abstract class Mammal implements Animal {
    protected Spine spine;

    protected static class Spine {
        int numberOfVertebrae;

        public Spine(int numberOfVertebrae) {
            this.numberOfVertebrae = numberOfVertebrae;
        }

        @Override
        public String toString() {
            return " имеет " + numberOfVertebrae + " позвонков";
        }
    }
}
