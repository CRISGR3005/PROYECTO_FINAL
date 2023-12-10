import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class SEGUNDA extends javax.swing.JFrame {

    private void CALCULAR() {

        try {

            // aqui es domde se solicita los datos para poder sacar resultados  
            String guardar = "";
            double peso = Double.parseDouble(txtpeso.getText());
            double altura = Double.parseDouble(txtaltura.getText());
            double dietaop = Double.parseDouble(txtop.getText());
           
            double res = peso / (altura * altura);
            
            if (dietaop == 1) {
                txtdieta3.setText("Desayuno:\n"
                        + "- 1 taza de avena cocida con agua o leche desnatada.\n"
                        + "- 1 plátano.\n"
                        + "- 1 vaso de zumo de naranja natural sin azúcares añadidos.\n"
                        + "- 1 taza de té verde sin azúcar.\n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 yogur bajo en grasa.\n"
                        + "- 1 puñado de almendras.\n"
                        + "\n"
                        + "Comida:\n"
                        + "- 1 porción de pechuga de pollo a la plancha.\n"
                        + "- 1 taza de arroz integral.\n"
                        + "- Ensalada de lechuga, tomate y pepino aderezada con vinagre y aceite de oliva.\n"
                        + "- 1 vaso de agua.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 rodaja de sandía.\n"
                        + "- 1 taza de té verde sin azúcar.\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de salmón a la plancha.\n"
                        + "- 1 taza de brócoli al vapor.\n"
                        + "- Ensalada de espinacas, zanahorias y aguacate aderezada con limón y aceite de oliva.\n"
                        + "- 1 vaso de agua.\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 taza de infusión de manzanilla o té de hierbas sin azúcar.");
            } else if (dietaop == 2) {
                txtdieta3.setText("Sedentario - Mantener peso\n"
                        + "Desayuno: \n"
                        + "- 1 rebanada de pan integral con aguacate y tomate.\n"
                        + "- 1 huevo cocido o revuelto.\n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 taza de té verde sin azúcar.\n"
                        + "- 1 manojo de uvas pequeñas.\n"
                        + "\n"
                        + "Comida:\n"
                        + "- 1 porción de carne magra como ternera o cerdo magro a la parrilla.\n"
                        + "- 1 porción de verduras asadas como zanahorias, pimientos y calabacín.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 puñado de semillas de chía.\n"
                        + "- 1 yogur griego bajo en grasa con una cucharada de miel.\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de pechuga de pollo a la plancha.\n"
                        + "- 1 porción de espárragos al vapor.\n"
                        + "- 1 porción de quinoa.\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 taza de infusión de camomila sin azúcar.");
            } else if (dietaop == 3) {
                txtdieta3.setText("Sedentario - Ganar peso\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 1 Huevo revuelto con espinaca o champiñones.\n"
                        + "- 1 taza de yogurt bajo en grasa.\n"
                        + "- 1 Rebanada de pan integral tostado \n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 puñado de nueces o almendras.\n"
                        + "\n"
                        + "Comida:\n"
                        + "- 1 porción de proteína magra como pechuga de pollo o pescado a la parrilla.\n"
                        + "- 1 porción de vegetales al vapor o ensalada mixta con aderezo bajo en grasa.\n"
                        + "- 1 porción de arroz integral o quinoa.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 yogurt bajo en grasa.\n"
                        + "- 1 fruta fresca.\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de proteína magra como pechuga de pollo o pescado al horno.\n"
                        + "- 1 porción de vegetales al vapor.\n"
                        + "- 1 porción de patatas al horno o batata.\n"
                        + "\n"
                        + "Antes de dormir::\n"
                        + "- 1 taza de té de hierbas sin azúcar.");
            } else if (dietaop == 4) {
                txtdieta3.setText("Desayuno:\n"
                        + "- 1 Huevo revuelto con espinaca o champiñones.\n"
                        + "- 1 taza de yogurt bajo en grasa.\n"
                        + "- 1 Rebanada de pan integral tostado \n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 puñado de nueces o almendras.\n"
                        + "\n"
                        + "Comida:\n"
                        + "- 1 porción de proteína magra como pechuga de pollo o pescado a la parrilla.\n"
                        + "- 1 porción de vegetales al vapor o ensalada mixta con aderezo bajo en grasa.\n"
                        + "- 1 porción de arroz integral o quinoa.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 yogurt bajo en grasa.\n"
                        + "- 1 fruta fresca.\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de proteína magra como pechuga de pollo o pescado al horno.\n"
                        + "- 1 porción de vegetales al vapor.\n"
                        + "- 1 porción de patatas al horno o batata.");
            } else if (dietaop == 6) {
                
                txtdieta3.setText("Moderado - Mantener peso\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 2 rebanadas de pan integral con aguacate y rodajas de tomate.\n"
                        + "- 1 tortilla de espinacas y champiñones.\n"
                        + "- 1 vaso de jugo de naranja recién exprimido.\n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 porción de frutas frescas (por ejemplo, una manzana y una rodaja de melón).\n"
                        + "- 1 puñado de almendras.\n"
                        + "\n"
                        + "Comida:\n"
                        + "- 1 porción de pechuga de pollo a la plancha.\n"
                        + "- 1 taza de arroz.\n"
                        + "- 1 taza de ensalada verde con tomate, pepino y vinagreta de limón.\n"
                        + "- 1 porción de pan integral.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 yogur bajo en grasa con 2 cucharadas de granola y frutas.\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de filete de salmón a la plancha.\n"
                        + "- 1/2 taza de pasta integral.\n"
                        + "- 1 taza de brócoli al vapor.\n"
                        + "\n"
                        + "Antes de dormir::\n"
                        + "- 1 taza de té de hierbas.\n"
                        + "- 1 trozo pequeño de chocolate negro.");
            } else if (dietaop == 7) {
                txtdieta3.setText("Moderado - Ganar peso\n"
                        + "\n"
                        + "Aquí tienes una dieta diseñada para ayudarte a ganar peso de forma saludable y variada. Incluye carne o pescado solo una vez al día:\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 2 rebanadas de pan integral con mantequilla de maní.\n"
                        + "- 1 tazón de cereal integral con leche entera.\n"
                        + "- 1 plátano.\n"
                        + "- 1 vaso de jugo de naranja natural.\n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 puñado de nueces o almendras.\n"
                        + "- 1 barra de granola casera.\n"
                        + "- 1 batido de proteína con leche entera y frutas.\n"
                        + "Comida:\n"
                        + "- Ensalada mixta con hojas verdes, tomate, pepino, zanahoria rallada y aguacate.\n"
                        + "- 1 porción de arroz cocido con verduras salteadas.\n"
                        + "- 1 taza de sopa de lentejas o garbanzos.\n"
                        + "- 1 yogur griego.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 manzana con mantequilla de almendra.\n"
                        + "- 1 vaso de batido de proteína con leche entera y plátano\n"
                        + "\n"
                        + "Cena:\n"
                        + "- Pechuga de pollo a la plancha con verduras asadas.\n"
                        + "- 1 porción de arroz integral.\n"
                        + "- Ensalada de espinacas, fresas y queso con aderezo..\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 taza de leche caliente con cacao sin azúcar.");
            } else if (dietaop == 8) {
                txtdieta3.setText("Activo - perder peso\n"
                        + "\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 1 Batido de leche entera con plátano y mantequilla de cacahuete.\n"
                        + "- 1 Tazón de avena con frutas secas, nueces y miel.\n"
                        + "- 1 rebanada de pan integral con aguacate y huevo revuelto.\n"
                        + "\n"
                        + "Merienda de la mañana:\n"
                        + "- 1 puñado de nueces mixtas.\n"
                        + "- 1 taza de yogur natural con granola y frutas frescas.\n"
                        + "\n"
                        + "Comida::\n"
                        + "- Porción de ensalada abundante de espinacas, quinoa, aguacate, nueces, tomate y vinagreta de aceite de oliva.\n"
                        + "- 1 Tortilla de huevo con verduras salteadas.\n"
                        + "- 1 taza de sopa de lentejas con verduras y queso rallado.\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "-  1 Barra de proteína.\n"
                        + "-  1 Manzana con mantequilla de almendras.\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 taza de pasta integral con salsa de tomate, champiñones, espinacas y queso parmesano.\n"
                        + "- 1 Tortitas de papas con verduras al horno.\n"
                        + "- 1/2 Taza de  arroz integral con vegetales salteados.\n"
                        + "\n"
                        + "Antes de dormir::\n"
                        + "- 1 Batido de proteínas con leche de almendras y frutas congeladas.\n"
                        + "- 1 Porción de zanahoria con hummus.\n"
                        + "\n"
                        + "Activo - Mantener peso:");
            } else if (dietaop == 9) {
                txtdieta3.setText("Activo - Mantener peso:\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 1 taza de avena cocida con frutas frescas (plátano, fresas, arándanos, etc.)\n"
                        + "- 1 yogur bajo en grasa\n"
                        + "- 1 vaso de zumo natural de naranja o pomelo\n"
                        + "\n"
                        + "Merienda de la  mañana:\n"
                        + "- 1 puñado de nueces o almendras\n"
                        + "- 1 pieza de fruta (manzana, pera, naranja, etc.)\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "Comida::\n"
                        + "- Ensalada mixta con lechuga, espinacas, tomate, pepino, zanahoria y aceite de oliva como aderezo.\n"
                        + "- 1 taza de arroz cocido con verduras salteadas (brócoli, champiñones, pimientos, etc.)\n"
                        + "- 1 rebanada de pan integral\n"
                        + "\n"
                        + "Meriend de la tarde:\n"
                        + "- 1 taza de yogur griego bajo en grasa con granola y frutos secos\n"
                        + "- 1 rebanada de pan integral con aguacate y tomate\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de pechuga de pollo a la plancha con verduras asadas (berenjena, calabacín, pimientos, etc.) \n"
                        + "- 1/2 taza de arroz integral\n"
                        + "- 1 porción de ensalada de col rizada con queso feta y nueces\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 vaso de leche desnatada o una infusión sin azúcar");
            } else if (dietaop == 10) {
                txtdieta3.setText("Activo - Ganar peso\n"
                        + " \n"
                        + "Desayuno:\n"
                        + "- 2 huevos cocidos al vapor\n"
                        + "- 1 rebanadas de pan integral \n"
                        + "- 1 taza de frutas mixtas (manzana, kiwi, fresas)\n"
                        + "\n"
                        + "Merienda de media mañana:\n"
                        + "- 1 puñado de nueces mixtas\n"
                        + "- 1 yogurt griego con miel\n"
                        + "\n"
                        + "Almuerzo:\n"
                        + "- Ensalada mixta con pollo a la parrilla cortado en trozos pequeños, aguacate, tomate, y aderezo de aceite de oliva y limón \n"
                        + "- 1 porción de arroz integral\n"
                        + "- 1 porción de verduras al vapor\n"
                        + "\n"
                        + "Merienda de la tarde:\n"
                        + "- 1 batido de proteínas casero: mezcla leche (puede ser de almendras), plátano, espinacas, mantequilla de maní y miel\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 taza de arroz cocida con verduras salteadas (ejemplo: cebolla, pimientos, champiñones) y aceite de oliva\n"
                        + "- 1 porción de salmón a la plancha con salsa de limón y romero\n"
                        + "- 1 porción de verduras al vapor\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 porción de frutos secos (almendras, nueces, etc.)\n"
                        + "- 1 vaso de leche entera");
              } else if (dietaop == 5) {
                txtdieta3.setText("Activo - Mantener peso:\n"
                        + "\n"
                        + "Desayuno:\n"
                        + "- 1 taza de avena cocida con frutas frescas (plátano, fresas, arándanos, etc.)\n"
                        + "- 1 yogur bajo en grasa\n"
                        + "- 1 vaso de zumo natural de naranja o pomelo\n"
                        + "\n"
                        + "Merienda de la  mañana:\n"
                        + "- 1 puñado de nueces o almendras\n"
                        + "- 1 pieza de fruta (manzana, pera, naranja, etc.)\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "Comida::\n"
                        + "- Ensalada mixta con lechuga, espinacas, tomate, pepino, zanahoria y aceite de oliva como aderezo.\n"
                        + "- 1 taza de arroz cocido con verduras salteadas (brócoli, champiñones, pimientos, etc.)\n"
                        + "- 1 rebanada de pan integral\n"
                        + "\n"
                        + "Meriend de la tarde:\n"
                        + "- 1 taza de yogur griego bajo en grasa con granola y frutos secos\n"
                        + "- 1 rebanada de pan integral con aguacate y tomate\n"
                        + "\n"
                        + "Cena:\n"
                        + "- 1 porción de pechuga de pollo a la plancha con verduras asadas (berenjena, calabacín, pimientos, etc.) \n"
                        + "- 1/2 taza de arroz integral\n"
                        + "- 1 porción de ensalada de col rizada con queso feta y nueces\n"
                        + "\n"
                        + "Antes de dormir:\n"
                        + "- 1 vaso de leche desnatada o una infusión sin azúcar");

            }
                    
                    
            
            
            
            
            
            
            
            
            
            
            
            
            //es para cachar datos no validos y retornar un mensaje de error
            
            if (peso <= 0 || altura <= 0) {
                if (peso <= 0 || altura <= 0) {
                    JOptionPane.showMessageDialog(this, "Peso y altura deben ser valores positivos", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

            }
            if (res < 18.5) {
                txtresultado2.setText("bajo del peso normal");
                guardar = "bajo del peso normal";
            } else if (res > 18.5 && res <= 24.9) {

                txtresultado2.setText("Peso normal");
                guardar = "peso normal";
            } else if (res >= 25.0 && res < 29.9) {

                txtresultado2.setText("Obesidad");
                guardar = "Obesidad";
            } else {
                txtresultado2.setText("Sobrepeso");
                guardar = "Sobrepeso";

            }
            
            switch (guardar) {
                case "bajo del peso normal":
                    if (altura >= 1.40 && altura <= 1.49) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones)\n"
                                + "3. Estocadas laterales (3 series de 12 repeticiones)\n"
                                + "4. Elevación de talones (3 series de 15 repeticiones)\n"
                                + "5. Patadas de glúteos (3 series de 15 repeticiones)\n"
                                + "6. Puente de glúteos (3 series de 12 repeticiones)\n"
                                + "7. Sentadillas sumo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Antebrazos:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 10 repeticiones)\n"
                                + "2. Flexiones de tríceps (3 series de 10 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Extensión de tríceps con mancuerna (3 series de 12 repeticiones)\n"
                                + "5. Flexiones de antebrazos (3 series de 12 repeticiones)\n"
                                + "6. Curl de bíceps martillo con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Extensiones de muñeca con mancuernas (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Miercoles - Espalda y Hombros:\n"
                                + "\n"
                                + "1. Remo con mancuerna (3 series de 12 repeticiones)\n"
                                + "2. Peso muerto (3 series de 10 repeticiones)\n"
                                + "3. Dominadas (3 series de 10 repeticiones)\n"
                                + "4. Press militar con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Encogimiento de hombros con mancuernas (3 series de 15 repeticiones)\n"
                                + "7. Hiperextensiones (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Jueves  - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Viernes - Abdominales y Core:\n"
                                + "\n"
                                + "1. Plancha (3 series de 30 segundos)\n"
                                + "2. Crunches (3 series de 20 repeticiones)\n"
                                + "3. Russian twists (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas en posición lateral (3 series de 12 repeticiones)\n"
                                + "5. Plancha lateral (3 series de 30 segundos por lado)\n"
                                + "6. Mountain climbers (3 series de 15 repeticiones)\n"
                                + "7. Sit-ups (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cuerpo completo:\n"
                                + "\n"
                                + "1. Saltos de caja (3 series de 12 repeticiones)\n"
                                + "2. Burpees (3 series de 10 repeticiones)\n"
                                + "3. Jumping jacks (3 series de 20 repeticiones)\n"
                                + "4. Sentadillas con salto (3 series de 10 repeticiones)\n"
                                + "5. Correr en el lugar (3 series de 30 segundos)\n"
                                + "6. Estocadas con salto (3 series de 12 repeticiones)\n"
                                + "7. Saltos laterales (3 series de 10 repeticiones)");
                    } else if (altura >= 1.50 && altura <= 1.59) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 10 repeticiones por pierna)\n"
                                + "3. Elevación de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 12 repeticiones)\n"
                                + "5. Abducciones de cadera (3 series de 15 repeticiones)\n"
                                + "6. Burpees (3 series de 10 repeticiones)\n"
                                + "7. Plancha (3 series de 30 segundos)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 10 repeticiones)\n"
                                + "3. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Tríceps dips (3 series de 10 repeticiones)\n"
                                + "5. Elevaciones laterales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Flexiones de tríceps (3 series de 12 repeticiones)\n"
                                + "7. Plancha con apoyo en los antebrazos (3 series de 30 segundos)\n"
                                + "\n"
                                + "Miércoles - descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Jueves - Espalda y Abdominales:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Supermans (3 series de 15 repeticiones)\n"
                                + "3. Plancha lateral (3 series de 30 segundos por lado)\n"
                                + "4. Levantamiento de piernas en posición boca abajo (3 series de 12 repeticiones)\n"
                                + "5. Encogimientos abdominales (3 series de 15 repeticiones)\n"
                                + "6. Plancha con giros (3 series de 10 repeticiones por lado)\n"
                                + "7. Extensiones de espalda en posición boca abajo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "\n"
                                + "\n"
                                + "Viernes - Pectorales y Tríceps:\n"
                                + "\n"
                                + "1. Flexiones declinadas (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps (3 series de 10 repeticiones)\n"
                                + "3. Aperturas con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Flexiones de tríceps en banco (3 series de 12 repeticiones)\n"
                                + "6. Cruce de cables en polea (3 series de 12 repeticiones)\n"
                                + "7. Plancha con apoyo en los antebrazos (3 series de 30 segundos)\n"
                                + "\n"
                                + "Sábado - Cuerpo completo:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "3. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Elevación de talones (3 series de 15 repeticiones)\n"
                                + "5. Curl de bíceps con mancuernas (3 series de 10 repeticiones)\n"
                                + "6. Plancha (3 series de 30 segundos)\n"
                                + "7. Abdominales (3 series de 15 repeticiones)");
                    } else if (altura >= 1.60 && altura <= 1.70) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Estocadas (3 series de 12 repeticiones cada pierna)\n"
                                + "3. Zancadas laterales (3 series de 12 repeticiones cada pierna)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Elevación de talones (3 series de 15 repeticiones)\n"
                                + "6. Saltos de tijera (3 series de 10 repeticiones)\n"
                                + "7. Elevaciones de gemelos con mancuernas (2 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Tríceps dips (3 series de 12 repeticiones)\n"
                                + "5. Flexiones de brazos en diamante (3 series de 10 repeticiones)\n"
                                + "6. Elevaciones laterales de hombros (3 series de 12 repeticiones)\n"
                                + "7. Flexiones de tríceps con mancuernas (2 series de 12 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Jueves: Abdomen y Core:\n"
                                + "\n"
                                + "1. Plancha (3 series de 30 segundos)\n"
                                + "2. Crunches (3 series de 15 repeticiones)\n"
                                + "3. Mountain climbers (3 series de 12 repeticiones por pierna)\n"
                                + "4. Russian twists (3 series de 12 repeticiones)\n"
                                + "5. Plancha lateral (3 series de 30 segundos cada lado)\n"
                                + "6. Jackknives (3 series de 12 repeticiones)\n"
                                + "7. Escaladores (3 series de 12 repeticiones por pierna)\n"
                                + "\n"
                                + "Viernes - Espalda y Pecho:\n"
                                + "\n"
                                + "1. Dominadas con banda elástica (3 series de 10 repeticiones)\n"
                                + "2. Press de banca con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Peso muerto (3 series de 10 repeticiones)\n"
                                + "5. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "6. Pullover con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cuerpo completo:\n"
                                + "\n"
                                + "1. Burpees (3 series de 10 repeticiones)\n"
                                + "2. Sentadillas con salto (3 series de 10 repeticiones)\n"
                                + "3. Mountain climbers (3 series de 12 repeticiones por pierna)\n"
                                + "4. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "5. Zancadas (3 series de 12 repeticiones cada pierna)\n"
                                + "6. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Plancha lateral (3 series de 30 segundos cada lado)");
                    } else if (altura >= 1.71 && altura <= 1.80) {
                        txtrutina.setText("Lunes - Piernas y glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones)\n"
                                + "3. Puente de glúteos (3 series de 12 repeticiones)\n"
                                + "4. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "5. Estocadas laterales (3 series de 12 repeticiones)\n"
                                + "6. Sentadilla sumo (3 series de 12 repeticiones)\n"
                                + "7. Saltos con cuclillas (3 series de 10 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Extensiones de tríceps (3 series de 12 repeticiones)\n"
                                + "3. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Flexiones diamante (3 series de 12 repeticiones)\n"
                                + "7. Plancha (3 series de 30 segundos)\n"
                                + "\n"
                                + "Miércoles - Pecho y tríceps:\n"
                                + "\n"
                                + "1. Flexiones inclinadas (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Extensiones de tríceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Flexiones declinadas (3 series de 12 repeticiones)\n"
                                + "6. Fondos de tríceps en banco (3 series de 12 repeticiones)\n"
                                + "7. Crunch con piernas levantadas (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Jueves - Espalda y abdomen:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Peso muerto con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Superman (3 series de 12 repeticiones)\n"
                                + "4. Encogimientos abdominales (3 series de 15 repeticiones)\n"
                                + "5. Plancha lateral (3 series de 30 segundos por lado)\n"
                                + "6. Extensión lumbar (3 series de 12 repeticiones)\n"
                                + "7. Crunches rusos (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Viernes -  Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Sábado - Cuerpo completo:\n"
                                + "\n"
                                + "1. Burpees (3 series de 10 repeticiones)\n"
                                + "2. Sentadilla con salto (3 series de 12 repeticiones)\n"
                                + "3. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "4. Plancha con codos (3 series de 30 segundos)\n"
                                + "5. Mountain climbers (3 series de 15 repeticiones por lado)\n"
                                + "6. Zancadas con cambio de pierna (3 series de 12 repeticiones)\n"
                                + "7. Russian twist con peso (3 series de 15 repeticiones por lado)");
                         } else if (altura >= 1.81 && altura <= 1.90) {
                        txtrutina.setText("\"Lunes - Piernas y Glúteos:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Sentadillas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"2. Estocadas (3 series de 12 repeticiones cada pierna)\\n\"\n" +
"                                + \"3. Zancadas laterales (3 series de 12 repeticiones cada pierna)\\n\"\n" +
"                                + \"4. Puente de glúteos (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"5. Elevación de talones (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"6. Saltos de tijera (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"7. Elevaciones de gemelos con mancuernas (2 series de 12 repeticiones)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Martes - Brazos y Hombros:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Flexiones de brazos (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"3. Press de hombros con mancuernas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"4. Tríceps dips (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"5. Flexiones de brazos en diamante (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"6. Elevaciones laterales de hombros (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"7. Flexiones de tríceps con mancuernas (2 series de 12 repeticiones)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Miércoles - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Jueves: Abdomen y Core:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Plancha (3 series de 30 segundos)\\n\"\n" +
"                                + \"2. Crunches (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"3. Mountain climbers (3 series de 12 repeticiones por pierna)\\n\"\n" +
"                                + \"4. Russian twists (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"5. Plancha lateral (3 series de 30 segundos cada lado)\\n\"\n" +
"                                + \"6. Jackknives (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"7. Escaladores (3 series de 12 repeticiones por pierna)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Viernes - Espalda y Pecho:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Dominadas con banda elástica (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"2. Press de banca con mancuernas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"3. Remo con mancuernas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"4. Peso muerto (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"5. Flexiones de pecho (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"6. Pullover con mancuerna (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"7. Hiperextensiones (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Sábado - Cuerpo completo:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Burpees (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"2. Sentadillas con salto (3 series de 10 repeticiones)\\n\"\n" +
"                                + \"3. Mountain climbers (3 series de 12 repeticiones por pierna)\\n\"\n" +
"                                + \"4. Flexiones de brazos (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"5. Zancadas (3 series de 12 repeticiones cada pierna)\\n\"\n" +
"                                + \"6. Press de hombros con mancuernas (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"7. Plancha lateral (3 series de 30 segundos cada lado)\");\n" );
                         }
                             
                         
                                
            
            
            
        
            
                    break;
                case "peso normal":
                    if (altura >= 1.40 && altura <= 1.49) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones)\n"
                                + "3. Puente de glúteos (3 series de 12 repeticiones)\n"
                                + "4. Elevaciones de pantorrillas (3 series de 15 repeticiones)\n"
                                + "5. Abducciones laterales de cadera (3 series de 12 repeticiones)\n"
                                + "6. Patadas de burro (3 series de 12 repeticiones)\n"
                                + "7. Saltos con sentadilla (3 series de 10 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 10 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Extensiones de tríceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Elevaciones laterales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Flexiones de tríceps en banco (3 series de 12 repeticiones)\n"
                                + "6. Flexiones de brazos diamante (3 series de 10 repeticiones)\n"
                                + "7. Curl de bíceps martillo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Jueves - Abdomen y core:\n"
                                + "1. Plancha abdominal (3 series de 30 segundos)\n"
                                + "2. Crunches (3 series de 15 repeticiones)\n"
                                + "3. Russian twists con peso (3 series de 10 repeticiones por lado)\n"
                                + "4. Elevaciones de piernas (3 series de 12 repeticiones)\n"
                                + "5. Plancha lateral (3 series de 30 segundos por lado)\n"
                                + "6. Escaladores (3 series de 12 repeticiones por lado)\n"
                                + "7. V-ups (3 series de 10 repeticiones)\n"
                                + "\n"
                                + "Viernes - Espalda:\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Peso muerto a una pierna (3 series de 10 repeticiones por lado)\n"
                                + "3. Vuelos de espalda con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Hiperextensiones (3 series de 12 repeticiones)\n"
                                + "5. Dominadas (3 series de 8 repeticiones)\n"
                                + "6. Superman (3 series de 12 repeticiones)\n"
                                + "7. Encogimientos de hombros (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cardio:\n"
                                + "\n"
                                + "1. Saltos en cuerdas (3 series de 1 minuto)\n"
                                + "2. Jumping jacks (3 series de 15 repeticiones)\n"
                                + "3. Burpees (3 series de 10 repeticiones)\n"
                                + "4. Correr en el sitio (3 series de 1 minuto)\n"
                                + "5. Mountain climbers (3 series de 10 repeticiones por lado)\n"
                                + "6. Zancadas con salto (3 series de 10 repeticiones)\n"
                                + "7. Ejercicios de step en lugar (3 series de 1 minuto)"
                                + "                    }");
                    } else if (altura >= 1.50 && altura <= 1.59) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Estocadas (3 series de 12 repeticiones por pierna)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puentes de glúteos (3 series de 12 repeticiones)\n"
                                + "5. Zancadas laterales (3 series de 12 repeticiones por pierna)\n"
                                + "6. Patadas de glúteos (3 series de 15 repeticiones por pierna)\n"
                                + "7. Sentadillas sumo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Pecho:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Extensiones de tríceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Flexión lateral de hombros con mancuernas (3 series de 12 repeticiones por lado)\n"
                                + "7. Planchas (3 series de 30 segundos)\n"
                                + "\n"
                                + "Miercoles - Espalda y Hombros:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Levantamiento lateral de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Peso muerto con piernas rígidas (3 series de 12 repeticiones)\n"
                                + "4. Encogimientos de hombros (3 series de 12 repeticiones)\n"
                                + "5. Nadadores (3 series de 12 repeticiones)\n"
                                + "6. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "7. Extensiones de espalda en posición de Superman (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Jueves - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Viernes - Abdominales:\n"
                                + "1. Crunches (3 series de 15 repeticiones)\n"
                                + "2. Plancha abdominal (3 series de 30 segundos)\n"
                                + "3. Elevaciones de piernas en posición supina (3 series de 12 repeticiones)\n"
                                + "4. Russian twists (3 series de 15 repeticiones)\n"
                                + "5. Bicicleta abdominal (3 series de 15 repeticiones)\n"
                                + "6. Plancha lateral (3 series de 30 segundos por lado)\n"
                                + "7. Escaladores (3 series de 12 repeticiones por pierna)\n"
                                + "\n"
                                + "Sábado - Cuerpo completo:\n"
                                + "1. Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "2. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "3. Sentadillas (3 series de 12 repeticiones)\n"
                                + "4. Plancha abdominal (3 series de 30 segundos)\n"
                                + "5. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "7. Sentadilla con salto (3 series de 12 repeticiones)");
                    } else if (altura >= 1.60 && altura <= 1.70) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "3. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "4. Elevación de piernas en posición de cuadrupedia (3 series de 12 repeticiones por pierna)\n"
                                + "5. Step-ups en una silla (3 series de 12 repeticiones por pierna)\n"
                                + "6. Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "7. Sentadilla sumo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Pecho y Tríceps:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Extensiones de tríceps con mancuerna (3 series de 12 repeticiones)\n"
                                + "5. Flexiones diamante (3 series de 10 repeticiones)\n"
                                + "6. Press de pecho en el suelo (3 series de 12 repeticiones)\n"
                                + "7. Patada de tríceps con mancuerna (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Miércoles - Espalda y Bíceps:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha con movimientos de remo (3 series de 10 repeticiones por brazo)\n"
                                + "4. Curl de bíceps martillo (3 series de 12 repeticiones)\n"
                                + "5. Supermans (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido (3 series de 12 repeticiones)\n"
                                + "7. Curl de bíceps concentrado (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Jueves - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Viernes - Hombros y Abdominales:\n"
                                + "\n"
                                + "1. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Elevaciones laterales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Encogimientos de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Oblicuos en posición de tabla lateral (3 series de 12 repeticiones por lado)\n"
                                + "6. Elevaciones frontales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Plancha con elevación de piernas (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cuerpo Completo:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Sentadillas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "5. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Press de hombros con mancuernas (3 series de 12 repeticiones)");
                    } else if (altura >= 1.71 && altura <= 1.80) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "3. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "4. Elevación de piernas en posición de cuadrupedia (3 series de 12 repeticiones por pierna)\n"
                                + "5. Step-ups en una silla (3 series de 12 repeticiones por pierna)\n"
                                + "6. Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "7. Sentadilla sumo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Pecho y Tríceps:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Extensiones de tríceps con mancuerna (3 series de 12 repeticiones)\n"
                                + "5. Flexiones diamante (3 series de 10 repeticiones)\n"
                                + "6. Press de pecho en el suelo (3 series de 12 repeticiones)\n"
                                + "7. Patada de tríceps con mancuerna (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Miércoles - Espalda y Bíceps:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha con movimientos de remo (3 series de 10 repeticiones por brazo)\n"
                                + "4. Curl de bíceps martillo (3 series de 12 repeticiones)\n"
                                + "5. Supermans (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido (3 series de 12 repeticiones)\n"
                                + "7. Curl de bíceps concentrado (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Jueves - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Viernes - Hombros y Abdominales:\n"
                                + "\n"
                                + "1. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Elevaciones laterales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Encogimientos de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Oblicuos en posición de tabla lateral (3 series de 12 repeticiones por lado)\n"
                                + "6. Elevaciones frontales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Plancha con elevación de piernas (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cuerpo Completo:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Sentadillas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "5. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Press de hombros con mancuernas (3 series de 12 repeticiones)");
                         } else if (altura >= 1.80 && altura < 1.90) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 12 repeticiones)\n"
                                + "2. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "3. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "4. Elevación de piernas en posición de cuadrupedia (3 series de 12 repeticiones por pierna)\n"
                                + "5. Step-ups en una silla (3 series de 12 repeticiones por pierna)\n"
                                + "6. Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "7. Sentadilla sumo (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Martes - Pecho y Tríceps:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3. Press de pecho con mancuernas (3 series de 12 repeticiones)\n"
                                + "4. Extensiones de tríceps con mancuerna (3 series de 12 repeticiones)\n"
                                + "5. Flexiones diamante (3 series de 10 repeticiones)\n"
                                + "6. Press de pecho en el suelo (3 series de 12 repeticiones)\n"
                                + "7. Patada de tríceps con mancuerna (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Miércoles - Espalda y Bíceps:\n"
                                + "\n"
                                + "1. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha con movimientos de remo (3 series de 10 repeticiones por brazo)\n"
                                + "4. Curl de bíceps martillo (3 series de 12 repeticiones)\n"
                                + "5. Supermans (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido (3 series de 12 repeticiones)\n"
                                + "7. Curl de bíceps concentrado (3 series de 12 repeticiones por brazo)\n"
                                + "\n"
                                + "Jueves - Descanso: Tómate un día completo de descanso para permitir que tu cuerpo se recupere.\n"
                                + "\n"
                                + "Viernes - Hombros y Abdominales:\n"
                                + "\n"
                                + "1. Press de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "2. Elevaciones laterales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Encogimientos de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "5. Oblicuos en posición de tabla lateral (3 series de 12 repeticiones por lado)\n"
                                + "6. Elevaciones frontales de hombros con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Plancha con elevación de piernas (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Sábado - Cuerpo Completo:\n"
                                + "\n"
                                + "1. Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2. Sentadillas (3 series de 12 repeticiones)\n"
                                + "3. Plancha (3 series de 30 segundos)\n"
                                + "4. Zancadas (3 series de 12 repeticiones por pierna)\n"
                                + "5. Remo con mancuernas (3 series de 12 repeticiones)\n"
                                + "6. Curl de bíceps con mancuernas (3 series de 12 repeticiones)\n"
                                + "7. Press de hombros con mancuernas (3 series de 12 repeticiones)");
                         
                        
                    }                     
                    break;
                case "Sobrepeso":
                    if (altura >= 1.40 && altura <= 1.49) {
                        
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 15 repeticiones)\n"
                                + "2. Zancadas (3 series de 15 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Desplantes laterales (3 series de 15 repeticiones)\n"
                                + "6. Abducción de cadera (3 series de 15 repeticiones)\n"
                                + "7. Extensiones de piernas sin peso (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4. Flexiones de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales de brazos (3 series de 15 repeticiones)\n"
                                + "6. Elevaciones frontales de brazos (3 series de 15 repeticiones)\n"
                                + "7. Rotaciones externas de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "Jueves - Abdomen y Espalda:\n"
                                + "\n"
                                + "1. Plancha (3 series de 1 minuto)\n"
                                + "2. Crunches abdominales (3 series de 20 repeticiones)\n"
                                + "3. Superman (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca arriba (3 series de 15 repeticiones)\n"
                                + "5. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones de espalda (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n"
                                + "Sábado - Cuerpo Completo:\n"
                                + "\n"
                                + "1. Sentadillas con salto (3 series de 12 repeticiones)\n"
                                + "2. Burpees (3 series de 12 repeticiones)\n"
                                + "3. Caminata en el sitio con levantamiento de rodillas (3 series de 1 minuto)\n"
                                + "4. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "5. Plancha lateral (3 series de 1 minuto por lado)\n"
                                + "6. Elevaciones laterales de piernas (3 series de 15 repeticiones)\n"
                                + "7. Giros rusos (3 series de 15 repeticiones)\n"
                                + "");
                    } else if (altura >= 1.50 && altura <= 1.59) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 15 repeticiones)\n"
                                + "2. Zancadas (3 series de 15 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Desplantes laterales (3 series de 15 repeticiones)\n"
                                + "6. Abducción de cadera (3 series de 15 repeticiones)\n"
                                + "7. Extensiones de piernas sin peso (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4. Flexiones de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales de brazos (3 series de 15 repeticiones)\n"
                                + "6. Elevaciones frontales de brazos (3 series de 15 repeticiones)\n"
                                + "7. Rotaciones externas de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "Jueves - Abdomen y Espalda:\n"
                                + "\n"
                                + "1. Plancha (3 series de 1 minuto)\n"
                                + "2. Crunches abdominales (3 series de 20 repeticiones)\n"
                                + "3. Superman (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca arriba (3 series de 15 repeticiones)\n"
                                + "5. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones de espalda (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n"
                                + ""
                                + "");
                    } else if (altura > 1.60 && altura < 1.70) {
                        txtrutina.setText("Lunes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4. Flexiones de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales de brazos (3 series de 15 repeticiones)\n"
                                + "6. Elevaciones frontales de brazos (3 series de 15 repeticiones)\n"
                                + "7. Rotaciones externas de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "Miercoles - Piernas y Glúteos:\n"
                                + "1. Sentadillas (3 series de 15 repeticiones)\n"
                                + "2. Zancadas (3 series de 15 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Desplantes laterales (3 series de 15 repeticiones)\n"
                                + "6. Abducción de cadera (3 series de 15 repeticiones)\n"
                                + "7. Extensiones de piernas sin peso (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "\n"
                                + "\n"
                                + "Jueves - Abdomen y Espalda:\n"
                                + "1. Plancha (3 series de 1 minuto)\n"
                                + "2. Crunches abdominales (3 series de 20 repeticiones)\n"
                                + "3. Superman (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca arriba (3 series de 15 repeticiones)\n"
                                + "5. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones de espalda (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Cardio (Descanso Activo): Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\nSábado - Cuerpo completo:\n"
                                + "\n"
                                + "1. Sentadillas con mancuernas (3 series de 20 repeticiones)\n"
                                + "2. Flexiones de pecho (3 series de 15 repeticiones)\n"
                                + "3. Zancadas (3 series de 20 repeticiones por pierna)\n"
                                + "4. Plancha (3 series de 1 minuto)\n"
                                + "5. Elevaciones de talones (3 series de 25 repeticiones)\n"
                                + "6. Fondos de tríceps en silla (3 series de 20 repeticiones)\n"
                                + "7. Superman (3 series de 15 repeticiones)"
                        );
                    } else if (altura >= 1.71 && altura <=1.80) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1.	Sentadillas (3 series de 15 repeticiones)\n"
                                + "2.	Zancadas (3 series de 15 repeticiones por pierna)\n"
                                + "3.	Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "4.	Elevación de talones (3 series de 20 repeticiones)\n"
                                + "5.	Estocadas laterales (3 series de 15 repeticiones por pierna)\n"
                                + "6.	Patadas de glúteos (3 series de 20 repeticiones por pierna)\n"
                                + "7.	Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1.	Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2.	Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3.	Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4.	Flexiones de hombros (3 series de 15 repeticiones)\n"
                                + "5.	Press de hombros (3 series de 12 repeticiones)\n"
                                + "6.	Extensiones de tríceps (3 series de 15 repeticiones)\n"
                                + "7.	Superman (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Cardio (Descanso Activo): Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n"
                                + "\n"
                                + "Jueves - Espalda:\n"
                                + "\n"
                                + "1.	 Remo invertido (3 series de 15 repeticiones)\n"
                                + "2.	 Extensiones de espalda (3 series de 12 repeticiones)\n"
                                + "3.	 Superman (3 series de 12 repeticiones)\n"
                                + "4.	 Puentes de glúteos (3 series de 12 repeticiones)\n"
                                + "5.	 Plancha (3 series de 1 minuto)\n"
                                + "6.	 Levantamiento de piernas (3 series de 15 repeticiones)\n"
                                + "7.	 Elevaciones laterales de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Abdominales:\n"
                                + "\n"
                                + "1.	Crunch abdominal (3 series de 20 repeticiones)\n"
                                + "2.	Plancha (3 series de 1 minuto)\n"
                                + "3.	Elevaciones de piernas en posición supina (3 series de 15 repeticiones)\n"
                                + "4.	Bicicleta abdominal (3 series de 20 repeticiones)\n"
                                + "5.	Escaladores (3 series de 15 repeticiones)\n"
                                + "6.	Plancha lateral (3 series de 1 minuto por lado)\n"
                                + "7.	Tijeras abdominales (3 series de 15 repeticiones)\n"
                                + "\n");
                         } else if (altura >= 1.80 && altura < 1.90) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1.	Sentadillas (3 series de 15 repeticiones)\n"
                                + "2.	Zancadas (3 series de 15 repeticiones por pierna)\n"
                                + "3.	Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "4.	Elevación de talones (3 series de 20 repeticiones)\n"
                                + "5.	Estocadas laterales (3 series de 15 repeticiones por pierna)\n"
                                + "6.	Patadas de glúteos (3 series de 20 repeticiones por pierna)\n"
                                + "7.	Saltos de tijera (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1.	Flexiones de pecho (3 series de 12 repeticiones)\n"
                                + "2.	Fondos de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "3.	Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4.	Flexiones de hombros (3 series de 15 repeticiones)\n"
                                + "5.	Press de hombros (3 series de 12 repeticiones)\n"
                                + "6.	Extensiones de tríceps (3 series de 15 repeticiones)\n"
                                + "7.	Superman (3 series de 12 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Cardio (Descanso Activo): Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n"
                                + "\n"
                                + "Jueves - Espalda:\n"
                                + "\n"
                                + "1.	 Remo invertido (3 series de 15 repeticiones)\n"
                                + "2.	 Extensiones de espalda (3 series de 12 repeticiones)\n"
                                + "3.	 Superman (3 series de 12 repeticiones)\n"
                                + "4.	 Puentes de glúteos (3 series de 12 repeticiones)\n"
                                + "5.	 Plancha (3 series de 1 minuto)\n"
                                + "6.	 Levantamiento de piernas (3 series de 15 repeticiones)\n"
                                + "7.	 Elevaciones laterales de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Abdominales:\n"
                                + "\n"
                                + "1.	Crunch abdominal (3 series de 20 repeticiones)\n"
                                + "2.	Plancha (3 series de 1 minuto)\n"
                                + "3.	Elevaciones de piernas en posición supina (3 series de 15 repeticiones)\n"
                                + "4.	Bicicleta abdominal (3 series de 20 repeticiones)\n"
                                + "5.	Escaladores (3 series de 15 repeticiones)\n"
                                + "6.	Plancha lateral (3 series de 1 minuto por lado)\n"
                                + "7.	Tijeras abdominales (3 series de 15 repeticiones)\n");
                    
                    }
                    break;

                case "Obesidad":
                    if (altura >= 1.40 && altura <= 1.49) {
                        txtrutina.setText(" Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas con salto (3 series de 20 repeticiones)\n"
                                + "2. Zancadas laterales (3 series de 20 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 20 repeticiones)\n"
                                + "4. Puente de glúteos con una pierna (3 series de 15 repeticiones por pierna)\n"
                                + "5. Desplantes traseros (3 series de 20 repeticiones)\n"
                                + "6. Abducción de cadera en posición de cuatro patas (3 series de 20 repeticiones por pierna)\n"
                                + "7. Extensiones de piernas en el suelo (3 series de 17 repeticiones)\n"
                                + "\n"
                                + "Martes - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "\n"
                                + "\n"
                                + "Miércoles - Abdomen y Espalda:\n"
                                + "\n"
                                + "1. Plancha con elevación de rodilla (3 series de 1 minuto)\n"
                                + "2. Crunches invertidos (3 series de 20 repeticiones)\n"
                                + "3. Superman con contracciones (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca abajo (3 series de 15 repeticiones)\n"
                                + "5. Remo con mancuerna (3 series de 12 repeticiones)\n"
                                + "6. Hiperextensiones de espalda en el suelo (3 series de 15 repeticiones)\n"
                                + "7. Encogimientos de hombros con mancuerna (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Jueves - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones cerradas (3 series de 15 repeticiones)\n"
                                + "2. Fondos en banco (3 series de 15 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 20 repeticiones)\n"
                                + "4. Patada de tríceps con mancuerna (3 series de 15 repeticiones por brazo)\n"
                                + "5. Elevaciones frontales de brazos (3 series de 20 repeticiones)\n"
                                + "6. Tocar hombros con manos (3 series de 20 repeticiones)\n"
                                + "7. Rotaciones externas con mancuerna (3 series de 20 repeticiones por brazo)\n"
                                + "\n"
                                + "Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos o una hora dependiendo de ti, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n ");
                    } else if (altura >= 1.50 && altura <= 1.59) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas (3 series de 15 repeticiones)\n"
                                + "2. Zancadas (3 series de 15 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Desplantes laterales (3 series de 15 repeticiones)\n"
                                + "6. Abducción de cadera (3 series de 15 repeticiones)\n"
                                + "7. Extensiones de piernas sin peso (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4. Flexiones de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales de brazos (3 series de 15 repeticiones)\n"
                                + "6. Elevaciones frontales de brazos (3 series de 15 repeticiones)\n"
                                + "7. Rotaciones externas de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Miércoles - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "Jueves - Abdomen y Espalda:\n"
                                + "\n"
                                + "1. Plancha (3 series de 1 minuto)\n"
                                + "2. Crunches abdominales (3 series de 20 repeticiones)\n"
                                + "3. Superman (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca arriba (3 series de 15 repeticiones)\n"
                                + "5. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones de espalda (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n");
                    } else if (altura >= 1.60 && altura <= 1.70) {
                        txtrutina.setText("Lunes - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones de brazos (3 series de 12 repeticiones)\n"
                                + "2. Fondos en silla (3 series de 12 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 15 repeticiones)\n"
                                + "4. Flexiones de tríceps en silla (3 series de 12 repeticiones)\n"
                                + "5. Elevaciones laterales de brazos (3 series de 15 repeticiones)\n"
                                + "6. Elevaciones frontales de brazos (3 series de 15 repeticiones)\n"
                                + "7. Rotaciones externas de hombros (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Martes - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "Miercoles - Piernas y Glúteos:\n"
                                + "1. Sentadillas (3 series de 15 repeticiones)\n"
                                + "2. Zancadas (3 series de 15 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 15 repeticiones)\n"
                                + "4. Puente de glúteos (3 series de 15 repeticiones)\n"
                                + "5. Desplantes laterales (3 series de 15 repeticiones)\n"
                                + "6. Abducción de cadera (3 series de 15 repeticiones)\n"
                                + "7. Extensiones de piernas sin peso (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "\n"
                                + "\n"
                                + "Jueves - Abdomen y Espalda:\n"
                                + "1. Plancha (3 series de 1 minuto)\n"
                                + "2. Crunches abdominales (3 series de 20 repeticiones)\n"
                                + "3. Superman (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca arriba (3 series de 15 repeticiones)\n"
                                + "5. Flexiones de espalda (3 series de 12 repeticiones)\n"
                                + "6. Remo invertido con mancuerna (3 series de 12 repeticiones)\n"
                                + "7. Hiperextensiones de espalda (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Viernes - Cardio (Descanso Activo): Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n");
                    } else if (altura >= 1.71 && altura <= 1.80) {
                        txtrutina.setText("Lunes - Piernas y Glúteos:\n"
                                + "\n"
                                + "1. Sentadillas con salto (3 series de 20 repeticiones)\n"
                                + "2. Zancadas laterales (3 series de 20 repeticiones)\n"
                                + "3. Elevaciones de talones (3 series de 20 repeticiones)\n"
                                + "4. Puente de glúteos con una pierna (3 series de 15 repeticiones por pierna)\n"
                                + "5. Desplantes traseros (3 series de 20 repeticiones)\n"
                                + "6. Abducción de cadera en posición de cuatro patas (3 series de 20 repeticiones por pierna)\n"
                                + "7. Extensiones de piernas en el suelo (3 series de 17 repeticiones)\n"
                                + "\n"
                                + "Martes - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\n"
                                + "\n"
                                + "\n"
                                + "\n"
                                + "Miércoles - Abdomen y Espalda:\n"
                                + "\n"
                                + "1. Plancha con elevación de rodilla (3 series de 1 minuto)\n"
                                + "2. Crunches invertidos (3 series de 20 repeticiones)\n"
                                + "3. Superman con contracciones (3 series de 15 repeticiones)\n"
                                + "4. Elevaciones de piernas tumbado boca abajo (3 series de 15 repeticiones)\n"
                                + "5. Remo con mancuerna (3 series de 12 repeticiones)\n"
                                + "6. Hiperextensiones de espalda en el suelo (3 series de 15 repeticiones)\n"
                                + "7. Encogimientos de hombros con mancuerna (3 series de 15 repeticiones)\n"
                                + "\n"
                                + "Jueves - Brazos y Hombros:\n"
                                + "\n"
                                + "1. Flexiones cerradas (3 series de 15 repeticiones)\n"
                                + "2. Fondos en banco (3 series de 15 repeticiones)\n"
                                + "3. Curl de bíceps con mancuernas (3 series de 20 repeticiones)\n"
                                + "4. Patada de tríceps con mancuerna (3 series de 15 repeticiones por brazo)\n"
                                + "5. Elevaciones frontales de brazos (3 series de 20 repeticiones)\n"
                                + "6. Tocar hombros con manos (3 series de 20 repeticiones)\n"
                                + "7. Rotaciones externas con mancuerna (3 series de 20 repeticiones por brazo)\n"
                                + "\n"
                                + "Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos o una hora dependiendo de ti, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\n"
                                + "\n");
                        } else if (altura >= 1.80 && altura < 1.90) {
                        txtrutina.setText("+ \"\\n\"\n" +
"                                + \"1. Sentadillas con salto (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"2. Zancadas laterales (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"3. Elevaciones de talones (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"4. Puente de glúteos con una pierna (3 series de 15 repeticiones por pierna)\\n\"\n" +
"                                + \"5. Desplantes traseros (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"6. Abducción de cadera en posición de cuatro patas (3 series de 20 repeticiones por pierna)\\n\"\n" +
"                                + \"7. Extensiones de piernas en el suelo (3 series de 17 repeticiones)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Martes - Cardio (Descanso activo): Realiza una actividad cardiovascular de baja a moderada intensidad durante 30 minutos, como caminar, bailar o andar en bicicleta.\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Miércoles - Abdomen y Espalda:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Plancha con elevación de rodilla (3 series de 1 minuto)\\n\"\n" +
"                                + \"2. Crunches invertidos (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"3. Superman con contracciones (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"4. Elevaciones de piernas tumbado boca abajo (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"5. Remo con mancuerna (3 series de 12 repeticiones)\\n\"\n" +
"                                + \"6. Hiperextensiones de espalda en el suelo (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"7. Encogimientos de hombros con mancuerna (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Jueves - Brazos y Hombros:\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"1. Flexiones cerradas (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"2. Fondos en banco (3 series de 15 repeticiones)\\n\"\n" +
"                                + \"3. Curl de bíceps con mancuernas (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"4. Patada de tríceps con mancuerna (3 series de 15 repeticiones por brazo)\\n\"\n" +
"                                + \"5. Elevaciones frontales de brazos (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"6. Tocar hombros con manos (3 series de 20 repeticiones)\\n\"\n" +
"                                + \"7. Rotaciones externas con mancuerna (3 series de 20 repeticiones por brazo)\\n\"\n" +
"                                + \"\\n\"\n" +
"                                + \"Viernes - Cardio: Elige una actividad cardiovascular de intensidad moderada a alta durante 30 minutos o una hora dependiendo de ti, como saltar la cuerda, correr en su lugar o hacer ejercicios de burpees.\\n\"\n" +
"                                + \"\\n\");");
                        
                    }
                default:

            }

            

            txtresultado.setText(Double.toString(res));
            
        
        } catch (NumberFormatException ex) {
            //ES PARA QUE EL CODIGO NO TENGA ERRRORES Y ESTE NO FALLE 
            JOptionPane.showMessageDialog(this, "Peso y altura deben ser valores positivos", "Error", JOptionPane.ERROR_MESSAGE);

            JOptionPane.showMessageDialog(this, "Porfavor introduce lo que se te pide :)  ", "Error", JOptionPane.ERROR_MESSAGE);
            txtpeso.setText("");

            txtpeso.setText("");

            txtaltura.setText("");

            txtnedad.setText("");

            txtnombre.setText("");

            txtresultado.setText("");

            txtresultado2.setText("");
            
            txtdieta3.setText("");
            txtrutina.setText("");
            
        }
        
        
        
      
    }

    public SEGUNDA() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnpeso = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtaltura = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnedad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        salix = new javax.swing.JButton();
        txtresultado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtresultado2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtrutina = new java.awt.TextArea();
        jLabel2 = new javax.swing.JLabel();
        txtdieta3 = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtop = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnpeso.setBackground(new java.awt.Color(47, 72, 88));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 251, 142));
        jLabel7.setText("INTRODUCE TU EDAD:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 251, 46));
        jLabel8.setText("serentario mantener peso - opcion (2)");

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 66));
        jLabel10.setText("BIENVENIDO FIT-FAT");

        txtaltura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtpeso.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(15, 252, 117));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 251, 142));
        jLabel11.setText("INTRODUCE TU NOMBRE:");

        txtnedad.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtnedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnedadActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 210, 252));
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salix.setBackground(new java.awt.Color(255, 0, 51));
        salix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salix.setText("salida");
        salix.setToolTipText("");
        salix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salixActionPerformed(evt);
            }
        });

        txtresultado.setEditable(false);
        txtresultado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(169, 241, 156));
        jLabel13.setText("resultados  IMC");

        txtresultado2.setEditable(false);
        txtresultado2.setBackground(new java.awt.Color(255, 255, 255));
        txtresultado2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        txtresultado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultado2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 251, 46));
        jLabel14.setText("INTRODUCE TU ESTATURA(m):");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(168, 222, 47));
        jLabel16.setText("TIENE");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 227, 112));
        jLabel1.setText("opciones de dieta");

        txtrutina.setBackground(new java.awt.Color(255, 255, 255));
        txtrutina.setEditable(false);
        txtrutina.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("rutinas ");

        txtdieta3.setBackground(new java.awt.Color(255, 255, 255));
        txtdieta3.setEditable(false);
        txtdieta3.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 227, 112));
        jLabel3.setText("dietas");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 251, 46));
        jLabel9.setText("INTRODUCE TU PESO(kg) :");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 251, 46));
        jLabel17.setText("moderado mantener peso - opcion (5)");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 251, 46));
        jLabel18.setText("serentario perder peso- opcion (1)");

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 251, 46));
        jLabel19.setText("serentario ganar peso -opcion (3)");

        txtop.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 251, 46));
        jLabel20.setText("moderado ganar peso - opcion (6)");

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 251, 46));
        jLabel21.setText("moderado perder peso - opcion (4)");

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 251, 46));
        jLabel22.setText("activo ganar peso - opcion (7)");

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 251, 46));
        jLabel23.setText("activo ganar peso - opcion (9)");

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 251, 46));
        jLabel24.setText("activo ganar peso - opcion (10)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 227, 112));
        jLabel4.setText("activos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 227, 112));
        jLabel5.setText("serentario");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 227, 112));
        jLabel6.setText("moderado");

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("INICIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("FRASES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtnpesoLayout = new javax.swing.GroupLayout(txtnpeso);
        txtnpeso.setLayout(txtnpesoLayout);
        txtnpesoLayout.setHorizontalGroup(
            txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtnpesoLayout.createSequentialGroup()
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(txtnpesoLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtnpesoLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(15, 15, 15)))
                                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtresultado)
                                            .addComponent(txtresultado2)))
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(txtnpesoLayout.createSequentialGroup()
                                    .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(41, 41, 41)
                                    .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnedad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(txtnpesoLayout.createSequentialGroup()
                            .addGap(564, 564, 564)
                            .addComponent(jLabel10)))
                    .addGroup(txtnpesoLayout.createSequentialGroup()
                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtnpesoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txtnpesoLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel17)
                                            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(txtnpesoLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24)
                                                    .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel23))))
                                            .addGroup(txtnpesoLayout.createSequentialGroup()
                                                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton1)
                                                    .addComponent(jLabel20))
                                                .addGap(43, 43, 43)
                                                .addComponent(jButton3)))
                                        .addGap(0, 142, Short.MAX_VALUE))
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(txtop, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salix)
                                        .addGap(34, 34, 34))))
                            .addGroup(txtnpesoLayout.createSequentialGroup()
                                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel6))
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel18)
                                    .addGroup(txtnpesoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)))
                        .addComponent(txtdieta3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtrutina, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtnpesoLayout.createSequentialGroup()
                    .addContainerGap(1016, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(239, 239, 239)))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtnpesoLayout.createSequentialGroup()
                    .addGap(562, 562, 562)
                    .addComponent(jLabel3)
                    .addContainerGap(721, Short.MAX_VALUE)))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtnpesoLayout.createSequentialGroup()
                    .addGap(640, 640, 640)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(640, Short.MAX_VALUE)))
        );
        txtnpesoLayout.setVerticalGroup(
            txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtnpesoLayout.createSequentialGroup()
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtnpesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtnpesoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtresultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(2, 2, 2)
                .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtrutina, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(txtdieta3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtnpesoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salix)
                        .addComponent(jButton3)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtnpesoLayout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(jLabel2)
                    .addContainerGap(549, Short.MAX_VALUE)))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtnpesoLayout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jLabel3)
                    .addContainerGap(538, Short.MAX_VALUE)))
            .addGroup(txtnpesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtnpesoLayout.createSequentialGroup()
                    .addGap(476, 476, 476)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtnpeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtnpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtresultado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultado2ActionPerformed
        // donde se cuentra el peso de la persona

    }//GEN-LAST:event_txtresultado2ActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultadoActionPerformed

    private void salixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salixActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salixActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //creado para que este boton genere los resltados del diagnostico
        CALCULAR();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnedadActionPerformed

        //edad
    }//GEN-LAST:event_txtnedadActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed

        //peso
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        //nombre
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
        //estatura

    }//GEN-LAST:event_txtalturaActionPerformed

    private void txtopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PREINICIO prueba=new PREINICIO();
       prueba.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ULTIMA prueba=new ULTIMA();
prueba.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

  
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEGUNDA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton salix;
    private javax.swing.JTextField txtaltura;
    private java.awt.TextArea txtdieta3;
    private javax.swing.JTextField txtnedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPanel txtnpeso;
    private javax.swing.JTextField txtop;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtresultado2;
    private java.awt.TextArea txtrutina;
    // End of variables declaration//GEN-END:variables

}
