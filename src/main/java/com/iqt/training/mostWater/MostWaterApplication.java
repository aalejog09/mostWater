package com.iqt.training.mostWater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MostWaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MostWaterApplication.class, args);
		//Dado un arreglo de alturas, calcular el area de un rectangulo que permita contener la mayor cantidad de agua.
		int [] heights={1,8,6,2,5,4,8,3,7};
		//formula del area del rectangulo = Base * Altura.
		int width =0;
		int height=0;
		int area=0;
		int maxArea=0;
		//se debe obtener 2 alturas cualquieras y luego obtener la distancia entre las alturas para obtener su base. posteriormente retornar la mayor altura que satisfaga el enunciado.

		int p1=0; //es el apuntador que inicia en la primera posicion del arreglo (para obtener la primera altura)
		int p2=heights.length-1; //es el apuntador que indica la ultima posicion del arreglo de alturas (para obtener la ultima altura)

		while (p1<p2){
			//minima altura entre las primera  y la ultima
			height = Math.min(heights[p1], heights[p2]);
			//diferencia entre la ultima altura y la primera
			width=p2-p1;
			//base por altura
			area=height*width;
			//area maxima entre la max declarada y el area obtenida.
			maxArea=Math.max(maxArea,area);
			//si la altura 1 es menor que la 2, entonces paso el apuntador a la siguiente altura 1.
			if (heights[p1] < heights[p2]){
				p1 +=1;
			}else{
			//si la altura 2 es menor que la 1, entonces paso la altura 2 a la anterior.
				p2-=1;
			}
			//muestro la mayor area
			System.out.println("maxArea: "+maxArea);
		}
	}
}
