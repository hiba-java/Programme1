package org.example;

public interface Observer {
  /*
  On utilise le patron de conception comportemental : 'Observateur'
  Il nous permet de notifier le spectateur par les actions des tours exécutées par le singe
   */

    String update(Tour tour,Singe singe);
}
