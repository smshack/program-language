package lecture27;

import java.util.ArrayList;
import java.util.Iterator;

public class MapEx2 {
	public static void main(String[] args) {
	
			long start = 0;

			long end = 0;



			int inRoopSize = 100;

			int maxRoopSize = 10000000;



			ArrayList<Integer> list = new ArrayList<Integer>();

			ArrayList<Double> result = new ArrayList<Double>();

			Double[] arr = new Double[10000000];

			for (int i = 0; i < maxRoopSize; i++)

				list.add(i);



			

			// Iterator 사용 시 실행 시간

			System.out.println("----Iterator 사용 시----");

			for (int idx = 0; idx < inRoopSize; idx++) {

				start = System.nanoTime(); // 시작시간



				Iterator<Integer> itr = list.iterator();

				while (itr.hasNext()) {

					list.get(itr.next());

				}



				end = System.nanoTime(); // 끝나는 시간



				result.add(((double) (end - start) / 1000000000));

			}



			for (int i = 0; i < inRoopSize; i++)

				arr[i] = result.get(i);



			for (int i = 0; i < inRoopSize; i++)

				for (int j = 0; j < inRoopSize; j++)

					if (arr[i] < arr[j]) {

						double temp = arr[j];

						arr[j] = arr[i];

						arr[i] = temp;

					}



			for (int i = 0; i < 10; i++)

				System.out.println((i + 1) + " : " + arr[i] + "(sec)");

			

			System.out.println();

			

			// Size 받아온 코드 실행 시간

			System.out.println("-----Size 받아오는 방법 사용 시-----");

			for (int idx = 0; idx < inRoopSize; idx++) {

				start = System.nanoTime();

				int size = list.size();

				for (int i = 0; i < size; i++) {

					list.get(i);

				}

				end = System.nanoTime();



				result.add(((double) (end - start) / 1000000000));

			}

			

			arr = new Double[10000000];

			for (int i = 0; i < inRoopSize; i++)

				arr[i] = result.get(i);



			for (int i = 0; i < inRoopSize; i++)

				for (int j = 0; j < inRoopSize; j++)

					if (arr[i] < arr[j]) {

						double temp = arr[j];

						arr[j] = arr[i];

						arr[i] = temp;

					}



			for (int i = 0; i < 10; i++)

				System.out.println((i + 1) + " : " + arr[i] + "(sec)");

		}

		/*
		 * Iterator 는 자동으로 Index 를 관리해주기 때문에,
		 * 
		 * 사용에 편리함이 있을수 있으나
		 * 
		 * Iterator 를 열어보면 객체를 만들어 사용하기 때문에 느릴수 밖에 없다.
		 * 그러므로, list 의 size를 받아와서 사용것이 더 좋다.
		 */



		
	}

