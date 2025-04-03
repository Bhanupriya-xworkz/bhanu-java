package com.xworkz.inheretence.internal;

    public class Whiteboard extends Board {
        public void WB()
        {
            System.out.println("no-args const of whiteboard");
        }

        {
            super.draw();
            System.out.println("drawing on the whiteboard with markers");
        }

        {
            super.erase();
            System.out.println("erasing from the whiteboard with an eraser");
        }

        {
            super.write();
            System.out.println("writing on the whiteboard with a marker");
        }

        {
            super.clean();
            System.out.println("cleaning the whiteboard with a cleaner spray");
        }

        public void markText()
        {
            System.out.println("marking important text on the whiteboard");
        }

        public void organizeContent()
        {
            System.out.println("organizing the content on the whiteboard for better visibility");
        }
    }

