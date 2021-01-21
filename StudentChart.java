
public class StudentChart {

	public void draw(int[] computedModuleMark) {

		Bar xAxis = new Bar();
		xAxis.makeVisible();
		xAxis.changeColour(Colour.BLACK);
		xAxis.changeSize(1, 200);

		Bar yAxis = new Bar();
		yAxis.makeVisible();
		yAxis.changeColour(Colour.BLACK);
		yAxis.changeSize(206, 1);
		yAxis.moveVertical(200);

		Bar CSC1021 = new Bar();
		CSC1021.makeVisible();
		CSC1021.changeSize(30, 2 * computedModuleMark[0]);
		CSC1021.moveVertical(200 - 2 * computedModuleMark[0]);
		CSC1021.moveHorizontal(1);

		Bar CSC1022 = new Bar();
		CSC1022.makeVisible();
		CSC1022.changeSize(30, 2 * computedModuleMark[1]);
		CSC1022.moveHorizontal(36);
		CSC1022.moveVertical(200 - 2 * computedModuleMark[1]);

		Bar CSC1023 = new Bar();
		CSC1023.makeVisible();
		CSC1023.changeSize(30, 2 * computedModuleMark[2]);
		CSC1023.moveHorizontal(71);
		CSC1023.moveVertical(200 - 2 * computedModuleMark[2]);

		Bar CSC1024 = new Bar();
		CSC1024.makeVisible();
		CSC1024.changeSize(30, 2 * computedModuleMark[3]);
		CSC1024.moveHorizontal(106);
		CSC1024.moveVertical(200 - 2 * computedModuleMark[3]);

		Bar CSC1025 = new Bar();
		CSC1025.makeVisible();
		CSC1025.changeSize(30, 2 * computedModuleMark[4]);
		CSC1025.moveHorizontal(141);
		CSC1025.moveVertical(200 - 2 * computedModuleMark[4]);

		Bar CSC1026 = new Bar();
		CSC1026.makeVisible();
		CSC1026.changeSize(30, 2 * computedModuleMark[5]);
		CSC1026.moveHorizontal(176);
		CSC1026.moveVertical(200 - 2 * computedModuleMark[5]);

		Bar[] modules = { CSC1021, CSC1022, CSC1023, CSC1024, CSC1025, CSC1026 };

		for (int i = 0; i < 6; i++)
			if (computedModuleMark[i] >= 70)
				modules[i].changeColour(Colour.MAGENTA);
			else if (computedModuleMark[i] >= 40)
				modules[i].changeColour(Colour.GREEN);
			else if (computedModuleMark[i] >= 35)
				modules[i].changeColour(Colour.YELLOW);
			else
				modules[i].changeColour(Colour.RED);

	}

}
