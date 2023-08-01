import './App.css'
import Greet from './components/Greet'
// import Message from './components/message'
// import { ClickHandler } from './components/ClickHandler'
// import { ParentComponent } from './components/ParentComponent'
// import { UserGreeting } from './components/UserGreeting'

function App() {
  return (
    <div className='App'>
      <Greet name='Bruce' heroName='Batman' />
      <Greet name='Clark' heroName='Superman'>
        <div>
          <button>Action</button>
          <button>Action</button>
        </div>
      </Greet>
      <Greet name='Diana' heroName='Wonder Woman'>
        <p>This is children props</p>
        <p>This is children props</p>
      </Greet>
      {/* <Message></Message>
      <ClickHandler></ClickHandler> */}
      {/* <ParentComponent></ParentComponent> */}
      {/* <UserGreeting name='Bruce'></UserGreeting> */}
    </div>
  )
}

export default App
