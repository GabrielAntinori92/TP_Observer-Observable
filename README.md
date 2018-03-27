# TP_Observer-Observable

1)  La clase Observable indica que sufrio un cambio mediante el metodo setChanged(),
    luego notifica a los todos los Observadores mediante el metodo notifyObservers(),
    este metodo puede tener como parametro un Object, que luego servira como segundo parametro en el metodo update() del Observer
    siendo el primero el mismo objeto Observable que llamo al notityObservers().
    
2)  Al metodo update se pasan como argumentos, el "Observable" que llamo al metodo notifyObservers() y/o un Object como parametro del metodo notifyObservers().
    Este metodo se ejecuta cuando se llama al notifyObservers().
