void setup() {
  Serial.begin(115200);
  pinMode(13, OUTPUT);
  digitalWrite(13, LOW);
}

void loop() {
  if (Serial.available() > 0){
    String dadosRecebido = Serial.readStringUntil('\r');
    if (dadosRecebido.equals('ON')){
      digitalWrite(13, HIGH);
      Serial.println("LED Acesso!");
    }
     if (dadosRecebido.equals('OFF')){
      digitalWrite(13, LOW);
      Serial.println("LED apagado!");
    }

  }
}
