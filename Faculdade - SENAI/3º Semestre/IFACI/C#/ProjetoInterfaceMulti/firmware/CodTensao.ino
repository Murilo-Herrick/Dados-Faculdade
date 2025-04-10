// SERIAL TEMPERATURA
// IFACI-SENAI SÃO CARLOS
// CSTADS
// 02/04/2025
// AUTOR: VINICIUS BROLEZZI GABAN
#include <ArduinoJson.h>
  #define potenci  A0
  float convTensao = 0;
  #define alerta 5
  

  #define SENSOR A2      // DEFINE O PINO ANALÓGICO A0 COMO ENTRADA DO SENSOR
  float D = 2;      // VARIÁVEL PARA ARMAZENAR O VALOR LIDO DO SENSOR (0-1023)
  int T = 2;      // VARIÁVEL PARA ARMAZENAR A TEMPERATURA CALCULADA

  JsonDocument doc;

  

  void setup (){
    Serial.begin(9600);    // INICIA A COMUNICAÇÃO SERIAL COM TAXA DE 9600 BAUDS 
    pinMode(alerta, OUTPUT);
  }

  void loop (){

    D = analogRead (SENSOR);    
    T = (D * 5 * 100)  / 1023;    // CONVERTE O VALOR LIDO PARA TEMPERATURA
    //Serial.println(T);            // ENVIA O VALOR DA TEMPERATURA PARA O SERIAL
    //delay(1000);    // AGUARDA 1 SEGUNDO ANTES DA PRÓXIMA LEITURA

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

