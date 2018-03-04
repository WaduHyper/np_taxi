using FiveM
using np_phoneconnector.Java
using FiveM-Resources.net
using FiveM.UI
using NoPixelDevMode


    public np_phoneconnector calltaxi;
    public FiveM call;
    private NoPixelDevMode phone;
    private NoPixelDevMode taxiDriver;
    public FiveM.UI PlayerID;


    public call()
    {
      If Local.player = ({ONLINE}).(TogglePhone) data = 'Phone' Then
      <SubLine><name>"Call Taxi"</name><color>0515621</color></SunLine>
      End If
      Local -1 Ped calltaxi('Phone' data == np_phoneconnector(1))
      Start resource:np_taxi = true
      Start resource Only = data(server.cfg) = -subline + Start
      If resource Only = data(server.cfg) = NoCodeInfo(0) Then
      consolePrint("you didn't add [Start Resource] to your server.cfg")
      End If
    }
  End

    public taxiDriver()
    {
      Use np_phoneconnector = Set Waypoint( data = 'Caller' )
      If taxiDriver.chatMessage = "/dispatch" {PlayerID} <Message> Then
      chatPrint.Caller({Message}) = Save.chatMessage ToString {Message}
      Start FiveM-Resource 'np_taxi' OnlyIf PlayerInfoInData(1)
    }
  End
