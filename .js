const parkingLot = new Array(10).fill(0);

function parkcar(){
    
    for(let i = 0; i < parkingLot.length; i++){
        if(parkingLot[i] == 0){
            parkingLot[i] = i;

            console.log(`car parked at the slot ${i + 1}`);
            return;
        }        
    }

    console.log("Parking lot is full");

}

function removeCar(slotNumber){
    if( slotNumber < 1 || slotNumber > parkingLot.length){
        console.log("Invalid Slot");
        return;
    }
    
    if(parkingLot[slotNumber - 1] == 0){

        console.log("Slot is already Empty")
    }
    else{

        parkingLot[slotNumber - 1] = 0;
        console.log('Car removed from parking lot');
    }

}

function displayStatus(){
    for(let i = 0; i < parkingLot.length ; i+=1){
            if(i + 1 === 1){
            console.log('Occupied');
    }
    else{
        console.log("Available");
    }

    }
}

function countSlot(){

    let count = 0;
    for(let ){
        
    }
}
