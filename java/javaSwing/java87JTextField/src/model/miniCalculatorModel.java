package model;

public class miniCalculatorModel {
	private double firstValue;
	private double secondValue;
	private double answer;
	
	public miniCalculatorModel() {
	}

	public double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	public void plus() {
		this.answer =  this.firstValue + this.secondValue;
	}
	public void minus() {
		this.answer =  this.firstValue - this.secondValue;
	}
	public void multiply() {
		this.answer =  this.firstValue * this.secondValue;
	}
	public void divide() {
		this.answer =  this.firstValue / this.secondValue;
	}
	public void pow() {
		this.answer =  Math.pow(this.firstValue, this.secondValue);
	}
	public void mod() {
		this.answer =  this.firstValue % this.secondValue;
	}
}