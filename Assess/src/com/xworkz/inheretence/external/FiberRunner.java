package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Fiber;
import com.xworkz.inheretence.internal.OpticalFiber;

public class FiberRunner {
        public static void main(String[] args) {
            Fiber fiber = new OpticalFiber();
            fiber.transmission();
            Fiber basicFiber = new Fiber();
        }
    }

