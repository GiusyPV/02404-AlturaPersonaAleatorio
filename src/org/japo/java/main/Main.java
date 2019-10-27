/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {
    
    public static final Random RND = new Random();

    public static void main(String[] args) {
        
        final double ALTURA_MIN = 0.50; 
        final double ALTURA_MAX = 2.50;
        
        double altura;
        
        altura = RND.nextDouble() * (ALTURA_MAX - ALTURA_MIN) + ALTURA_MIN;
        
        System.out.printf(Locale.ENGLISH, "%s%.2f metros%n", "Altura aleatoria ..........: ", altura);
        
    }
}
