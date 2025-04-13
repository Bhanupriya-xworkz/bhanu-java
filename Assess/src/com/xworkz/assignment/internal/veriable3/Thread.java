package com.xworkz.assignment.internal.veriable3;

    public class Thread {
        private String name;
        private int priority;
        private boolean isDaemon;

        public Thread() {
            System.out.println("Running non-arg constructor Thread");
            System.out.println("name: " + this.name);
            this.name = "MainThread";
            this.priority = 5;
            this.isDaemon = false;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Priority: " + priority + ", Is Daemon: " + isDaemon;
        }

        @Override
        public int hashCode() {
            System.out.println("ThreadHashCode: " + super.hashCode());
            return 1234;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public void setDaemon(boolean isDaemon) {
            this.isDaemon = isDaemon;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null) {
                System.out.println("Reference is not null");
                if (obj instanceof Thread) {
                    System.out.println("Have reference. Will compare...");
                    Thread t1 = this;
                    Thread t2 = (Thread) obj;
                    if (t1.name.equals(t2.name) &&
                            t1.priority == t2.priority &&
                            t1.isDaemon == t2.isDaemon) {
                        System.out.println("Both are same");
                        return true;
                    }
                }
            }
            return false;
        }
    }

