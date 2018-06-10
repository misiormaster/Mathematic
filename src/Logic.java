import java.awt.Color;

public class Logic {

	private int number = 0;
	private int number2 = 0;
	int goodAnswer = 0;
	


	private UiMulti multi;
	public Logic(UiMulti multi) {
		this.multi = multi;
	}

	private UiDivision division;
	public Logic(UiDivision division) {
		this.division = division;
	}
	
	private UiAddition addition;
	public Logic(UiAddition addition) {
		this.addition = addition;
	}
	
	private UiSubtraction subtraction;
	public Logic(UiSubtraction subtraction) {
		this.subtraction = subtraction;
	}
	private UiSummary summary;
	public Logic(UiSummary summary) {
		this.summary = summary;
	}

	private UiMenu menu;
	public Logic(UiMenu menu) {
		this.menu = menu;
	}

	public int getValue1RandomNumber() {
		int value1RandomNumber = (int)(Math.random() *9 + 2 );
		return value1RandomNumber;
	}
	public int getValue2RandomNumber() {
		int value2RandomNumber = (int)(Math.random() *5 + 2 );
		return value2RandomNumber;
	}
	public int getValue3RandomNumber() {
		int value3RandomNumber = (int)(Math.random() *50 + 1 );
		return value3RandomNumber;
	}
	public int getValue4RandomNumber() {
		int value4RandomNumber = (int)(Math.random() *50 + 1 );
		return value4RandomNumber;
	}
	public int getValue5RandomNumber() {
		int value4RandomNumber = (int)(Math.random() *100 + 1 );
		return value4RandomNumber;
	}

	public void checkResultMulti() {
		String textResult = this.multi.txtResult.getText();
		String message = "";
		try {
			int userResult = Integer.parseInt(textResult);
			int goodResult = (number * number2);
			if(userResult == goodResult) {
				message = " Brawo!!! Wprowadzony wynik jest poprawny. ";
				this.multi.txtResult.setBackground(Color.GREEN);
				MultiPointsSummary();
			}else {
				message = " Żle!!! Prawidłowy wynik to " + goodResult;
				this.multi.txtResult.setBackground(Color.RED);
			}
		}catch(Exception e) {
			message = " Nie poprawne dane spróbuj jeszcze raz.";
		}finally {
			this.multi.lblComments.setText(message);
			this.multi.lblComments.requestFocus();
		}
	}

	public void checkResultDivision() {
		String textResult = this.division.txtResult.getText();
		String message = "";
		try {
			int userResult = Integer.parseInt(textResult);
			int goodResult = (number / number2);
			if(userResult == goodResult) {
				message = " Brawo!!! Wprowadzony wynik jest poprawny. ";
				this.division.txtResult.setBackground(Color.GREEN);
				DiviPointsSummary();
			}else {
				message = " Żle!!! Prawidłowy wynik to " + goodResult;
				this.division.txtResult.setBackground(Color.RED);
			}
		}catch(Exception e) {
			message = " Nie poprawne dane spróbuj jeszcze raz.";
		}finally {
			this.division.lblComments.setText(message);
			this.division.lblComments.requestFocus();
		}
	}

	public void checkResultAddition() {
		String textResult = this.addition.txtResult.getText();
		String message = "";
		try {
			int userResult = Integer.parseInt(textResult);
			int goodResult = (number + number2);
			if(userResult == goodResult) {
				message = " Brawo!!! Wprowadzony wynik jest poprawny. ";
				this.addition.txtResult.setBackground(Color.GREEN);
				AddPointsSummary();
			}else {
				message = " Żle!!! Prawidłowy wynik to " + goodResult;
				this.addition.txtResult.setBackground(Color.RED);
			}
		}catch(Exception e) {
			message = " Nie poprawne dane spróbuj jeszcze raz.";
		}finally {
			this.addition.lblComments.setText(message);
			this.addition.lblComments.requestFocus();
		}
	}

	public void checkResultSubtraction() {
		String textResult = this.subtraction.txtResult.getText();
		String message = "";
		try {
			int userResult = Integer.parseInt(textResult);
			int goodResult = (number - number2);
			if(userResult == goodResult) {
				message = " Brawo!!! Wprowadzony wynik jest poprawny. ";
				this.subtraction.txtResult.setBackground(Color.GREEN);
				SubPointsSummary();
			}else {
				message = " Żle!!! Prawidłowy wynik to " + goodResult;
				this.subtraction.txtResult.setBackground(Color.RED);
			}
		}catch(Exception e) {
			message = " Nie poprawne dane spróbuj jeszcze raz.";
		}finally {
			this.subtraction.lblComments.setText(message);
			this.subtraction.lblComments.requestFocus();
		}
	}


	public int moduloCheck(int randomNumber1 ) {
		int result;
		int randomNumber2;
		do {
			randomNumber2 = getValue1RandomNumber();
			result = randomNumber1 % randomNumber2;
		}while( result != 0);
		return randomNumber2;
	}

	public int checkIfitsPrime() {
		int inputInteger;
		boolean isInputIntegerPrime = true;
		do {
			inputInteger = getValue3RandomNumber();
			for (int x = 2; x < inputInteger; x++){
				if (inputInteger % x == 0)
				{
					isInputIntegerPrime = false;
				}
			}
		}while(isInputIntegerPrime == true);
		return inputInteger;
	}

	public int setLowerAmount(int randomNumber1 ) {
		int randomNumber2;
		do {
			randomNumber2 = getValue5RandomNumber();
		}while( randomNumber2 > randomNumber1);
		return randomNumber2;
	}
	public void MultiNumberOfTryes() {
		String counterText = this.multi.lblExampleNumb.getText();
		String message = this.multi.lblComments.getText();
		int counter = Integer.parseInt(counterText);
		String badMessage = " Nie poprawne dane spróbuj jeszcze raz.";
		if(message != badMessage){
			counter = counter + 1;
			counterText = Integer.toString(counter);
			this.multi.lblExampleNumb.setText(counterText);
			btnChoise_1Action();
		}
	}
	public void MultiGameSummary() {
		String finalExample = this.multi.lblExampleNumb.getText();
		int number = Integer.parseInt(finalExample);
		if( number > 20 ) {
			String pointsSum = this.multi.lblPoints.getText();
			this.multi.setVisible(false);
			UiSummary gameSummary = new UiSummary();
			gameSummary.setSize(800,700);
			gameSummary.setLocationRelativeTo(null);
			gameSummary.setVisible(true);
			gameSummary.lblUserPoints.setText(pointsSum);	
		}
	}
	public void MultiPointsSummary() {
		String goodMessage = " Brawo!!! Wprowadzony wynik jest poprawny. ";
		String message = this.multi.lblComments.getText();
		String counterMessage = this.multi.lblPoints.getText();

		int counter = Integer.parseInt(counterMessage);
		if(message != goodMessage) {
			counter = counter + 1;
		}
		String text = Integer.toString(counter);
		this.multi.lblPoints.setText(text);	
	}
	
	public void DiviNumberOfTryes() {
		String counterText = this.division.lblExampleNumb.getText();
		String message = this.division.lblComments.getText();
		int counter = Integer.parseInt(counterText);
		String badMessage = " Nie poprawne dane spróbuj jeszcze raz.";
		if(message != badMessage){
			counter = counter + 1;
			counterText = Integer.toString(counter);
			this.division.lblExampleNumb.setText(counterText);
			btnChoise_2Action();
		}

	}
	public void DiviGameSummary() {
		String finalExample = this.division.lblExampleNumb.getText();
		int number = Integer.parseInt(finalExample);
		if( number > 20 ) {
			String pointsSum = this.division.lblPoints.getText();
			this.division.setVisible(false);
			UiSummary gameSummary = new UiSummary();
			gameSummary.setSize(800,700);
			gameSummary.setLocationRelativeTo(null);
			gameSummary.setVisible(true);
			gameSummary.lblUserPoints.setText(pointsSum);	
		}
	}
	public void DiviPointsSummary() {
		String goodMessage = " Brawo!!! Wprowadzony wynik jest poprawny. ";
		String message = this.division.lblComments.getText();
		String counterMessage = this.division.lblPoints.getText();

		int counter = Integer.parseInt(counterMessage);
		if(message != goodMessage) {
			counter = counter + 1;
		}
		String text = Integer.toString(counter);
		this.division.lblPoints.setText(text);	
	}
	
	public void AddNumberOfTryes() {
		String counterText = this.addition.lblExampleNumb.getText();
		String message = this.addition.lblComments.getText();
		int counter = Integer.parseInt(counterText);
		String badMessage = " Nie poprawne dane spróbuj jeszcze raz.";
		if(message != badMessage){
			counter = counter + 1;
			counterText = Integer.toString(counter);
			this.addition.lblExampleNumb.setText(counterText);
			btnChoise_3Action();
		}

	}
	public void AddGameSummary() {
		String finalExample = this.addition.lblExampleNumb.getText();
		int number = Integer.parseInt(finalExample);
		if( number > 20 ) {
			String pointsSum = this.addition.lblPoints.getText();
			this.addition.setVisible(false);
			UiSummary gameSummary = new UiSummary();
			gameSummary.setSize(800,700);
			gameSummary.setLocationRelativeTo(null);
			gameSummary.setVisible(true);
			gameSummary.lblUserPoints.setText(pointsSum);	
		}
	}
	public void AddPointsSummary() {
		String goodMessage = " Brawo!!! Wprowadzony wynik jest poprawny. ";
		String message = this.addition.lblComments.getText();
		String counterMessage = this.addition.lblPoints.getText();

		int counter = Integer.parseInt(counterMessage);
		if(message != goodMessage) {
			counter = counter + 1;
		}
		String text = Integer.toString(counter);
		this.addition.lblPoints.setText(text);	
	}
	
	public void SubNumberOfTryes() {
		String counterText = this.subtraction.lblExampleNumb.getText();
		String message = this.subtraction.lblComments.getText();
		int counter = Integer.parseInt(counterText);
		String badMessage = " Nie poprawne dane spróbuj jeszcze raz.";
		if(message != badMessage){
			counter = counter + 1;
			counterText = Integer.toString(counter);
			this.subtraction.lblExampleNumb.setText(counterText);
			btnChoise_4Action();
		}

	}
	public void ASubGameSummary() {
		String finalExample = this.subtraction.lblExampleNumb.getText();
		int number = Integer.parseInt(finalExample);
		if( number > 20 ) {
			String pointsSum = this.subtraction.lblPoints.getText();
			this.subtraction.setVisible(false);
			UiSummary gameSummary = new UiSummary();
			gameSummary.setSize(800,700);
			gameSummary.setLocationRelativeTo(null);
			gameSummary.setVisible(true);
			gameSummary.lblUserPoints.setText(pointsSum);	
		}
	}
	public void SubPointsSummary() {
		String goodMessage = " Brawo!!! Wprowadzony wynik jest poprawny. ";
		String message = this.subtraction.lblComments.getText();
		String counterMessage = this.subtraction.lblPoints.getText();

		int counter = Integer.parseInt(counterMessage);
		if(message != goodMessage) {
			counter = counter + 1;
		}
		String text = Integer.toString(counter);
		this.subtraction.lblPoints.setText(text);	
	}



	public void btnChoise_testAction() {
		String message = " Wpisz prawidłowy wynik i wciścnij 'enter'.";
		this.multi.lblComments.setText(message);

		number = getValue1RandomNumber();
		String txtNumb = String.valueOf(number);
		this.multi.lblValue1.setText(txtNumb);

		number2 = getValue2RandomNumber();
		String txtNumb2 = String.valueOf(number2);
		this.multi.lblValue2.setText(txtNumb2);
		
	}
	public void btnChoise_2Action() {
		String message = " Wpisz prawidłowy wynik i wciścnij 'enter'.";
		this.division.lblComments.setText(message);

		number = checkIfitsPrime();
		String txtNumb = String.valueOf(number);
		this.division.lblValue1.setText(txtNumb);

		number2 = moduloCheck(number);
		String txtNumb2 = String.valueOf(number2);
		this.division.lblValue2.setText(txtNumb2);
	}
	public void btnChoise_3Action() {
		String message = " Wykonaj obliczenia, wpisz prawidłowy wynik i wciścnij 'enter'.";
		this.addition.lblComments.setText(message);

		number = getValue3RandomNumber();
		String txtNumb = String.valueOf(number);
		this.addition.lblValue1.setText(txtNumb);

		number2 = getValue4RandomNumber();
		String txtNumb2 = String.valueOf(number2);
		this.addition.lblValue2.setText(txtNumb2);
	}
	public void btnChoise_4Action() {
		String message = " Wykonaj obliczenia, wpisz prawidłowy wynik i wciścnij 'enter'.";
		this.subtraction.lblComments.setText(message);

		number = getValue5RandomNumber();
		String txtNumb = String.valueOf(number);
		this.subtraction.lblValue1.setText(txtNumb);

		number2 = setLowerAmount(number);
		String txtNumb2 = String.valueOf(number2);
		this.subtraction.lblValue2.setText(txtNumb2);
	}
	
	public void btnChoise_1Action() {
		String message = " Wpisz prawidłowy wynik i wciścnij 'enter'.";
		this.multi.lblComments.setText(message);
		
		number = getValue1RandomNumber();
		String txtNumb = String.valueOf(number);
		this.multi.lblValue1.setText(txtNumb);
		number2 = getValue2RandomNumber();
		String txtNumb2 = String.valueOf(number2);
		this.multi.lblValue2.setText(txtNumb2);
		ListOfRepetitions list = new ListOfRepetitions();
		list.listOfRep.add(txtNumb+txtNumb2);
		String listNumber = list.listOfRep.get(0);
		multi.lblTest.setText(listNumber);
		int size = list.listOfRep.size();
		String sizeTxt = String.valueOf(size);
		multi.lblTestSize.setText(sizeTxt);
		}

}
