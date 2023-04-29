import { Profile } from "./Profile";

describe('Profile Entity', () => {
   it('Profile is initialized with anonymous if name is not provided', () => {
      const profile = new Profile();
      const name = profile.getName();
      expect(name).toEqual("Anonymous");
   });
})
