package com.aston.task2.biology;

public abstract class Mammal implements Animal {
    Spine spine;

    public class Spine {
        int numberOfVertebrae = 46;

        public Spine(int numberOfVertebrae) {
            this.numberOfVertebrae = numberOfVertebrae;
        }


        void setNumberOfVertebrae( int numberOfVertebrae) {
            this.numberOfVertebrae = numberOfVertebrae;
        }
    }
}
