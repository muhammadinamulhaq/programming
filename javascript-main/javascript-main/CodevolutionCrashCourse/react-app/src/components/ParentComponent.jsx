import { ChildComponent } from './ChildComponent'

export const ParentComponent = () => {
  const greetParent = (childName) => {
    alert(`hello ${childName}`)
  }

  return <ChildComponent greetHandler={greetParent} />
}
