// SERIAL TEMPERATURA
// IFACI-SENAI SÃO CARLOS
// CSTADS
// 02/04/2025
// AUTOR: VINICIUS BROLEZZI GABAN
#include <ArduinoJson.h>
#include <DHT11.h>


  #define potenci  A0
  float convTensao = 0;
  #define alerta 5
  #define ledV 12
  #define ledA 13
  

 DHT11 dht(4);      // VARIÁVEL PARA ARMAZENAR A TEMPERATURA CALCULADA

  JsonDocument doc;

  

  void setup (){

    const char* json = "{\"Led\":\"led\"}";
    DeserializationError error = deserializeJson(doc, json);

    Serial.begin(9600);    // INICIA A COMUNICAÇÃO SERIAL COM TAXA DE 9600 BAUDS 
    pinMode(alerta, OUTPUT);
    pinMode(ledV, OUTPUT);
    pinMode(ledA, OUTPUT);
  }

  void loop (){

    bool Led = doc["Led"];

    if(Led){
      digitalWrite(ledA, LOW);
      digitalWrite(ledV, HIGH);

    }else{
      digitalWrite(ledV, LOW);
      digitalWrite(ledA, HIGH);
    }

    int T = dht.readTemperature();
   
    convTensao = analogRead(potenci);
    //Serial.println(convTensao);
    //Serial.println(".....");

    float tensao = (convTensao * 5 / 1023);

      if (tensao >= 2 && tensao < 3){
        tone(alerta, 10000,100);
        delay(500);
        
      }else if(tensao >=3 && tensao <4){
         tone(alerta, 10000,200);
         delay(400);
      }else if (tensao >= 4 && tensao < 4.95) {
         tone(alerta, 10000,100);
         delay(200);
       }else if( tensao >=4.95) {
          tone(alerta, 10000);
          delay(500);
          
        } else{
        noTone(alerta);
        delay(200);
      } 

      doc["temp"] = T;
      doc["tensao"] = tensao;
      serializeJson(doc, Serial);
      Serial.println();
      //delay(200);


    
    


  }

  int main(void){
    init ();  // INICIALIZA HARDWARE (FUNÇÃO INTERNA DO ARDUINO)
    setup (); // CHAMA A FUNÇÃO SETUP
    for (;;) // LOOP INFINITO
     loop(); // CHAMA CONTINUAMENTE A FUNÇÂO LOOP

     return 0;
  }

