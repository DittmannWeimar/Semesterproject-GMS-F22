const int redPin = 25;
const int greenPin = 27;
const int bluePin = 26;


void setup() {
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin, OUTPUT);

  analogWrite(redPin, 255);
  analogWrite(greenPin, 255);
  analogWrite(bluePin, 255);
}

void loop() {
  // put your main code here, to run repeatedly:

}
